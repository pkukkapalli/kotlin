/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.refactoring.extractFunction.ui;

import com.intellij.ui.BooleanTableCellRenderer;
import com.intellij.ui.TableUtil;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.table.JBTable;
import com.intellij.util.ui.EditableModel;
import kotlin.Function1;
import kotlin.KotlinPackage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.plugin.refactoring.JetNameSuggester;
import org.jetbrains.jet.plugin.refactoring.extractFunction.Parameter;
import org.jetbrains.jet.renderer.DescriptorRenderer;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;

public class KotlinParameterTablePanel extends JPanel {
    public static class ParameterInfo {
        private final Parameter originalParameter;
        private String name;
        private boolean enabled = true;

        public ParameterInfo(Parameter originalParameter) {
            this.originalParameter = originalParameter;
            this.name = originalParameter.getName();
        }

        public Parameter getOriginalParameter() {
            return originalParameter;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTypeAsString() {
            return DescriptorRenderer.SHORT_NAMES_IN_TYPES.renderType(getOriginalParameter().getParameterType());
        }

        public Parameter toParameter() {
            return new Parameter(
                    originalParameter.getArgumentText(),
                    name,
                    originalParameter.getMirrorVarName(),
                    originalParameter.getParameterType(),
                    originalParameter.getReceiverCandidate()
            );
        }
    }

    private List<ParameterInfo> parameterInfos;

    private JBTable myTable;
    private MyTableModel myTableModel;

    public KotlinParameterTablePanel() {
        super(new BorderLayout());
    }

    public void init(List<Parameter> parameters) {
        parameterInfos = KotlinPackage.map(
                parameters,
                new Function1<Parameter, ParameterInfo>() {
                    @Override
                    public ParameterInfo invoke(Parameter parameter) {
                        return new ParameterInfo(parameter);
                    }
                }
        );

        myTableModel = new MyTableModel();
        myTable = new JBTable(myTableModel);
        DefaultCellEditor defaultEditor = (DefaultCellEditor) myTable.getDefaultEditor(Object.class);
        defaultEditor.setClickCountToStart(1);

        myTable.setTableHeader(null);
        myTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TableColumn checkBoxColumn = myTable.getColumnModel().getColumn(MyTableModel.CHECKMARK_COLUMN);
        TableUtil.setupCheckboxColumn(checkBoxColumn);
        checkBoxColumn.setCellRenderer(
                new BooleanTableCellRenderer() {
                    @NotNull
                    @Override
                    public Component getTableCellRendererComponent(
                            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column
                    ) {
                        Component rendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                        rendererComponent.setEnabled(KotlinParameterTablePanel.this.isEnabled());
                        return rendererComponent;
                    }
                }
        );

        myTable.setPreferredScrollableViewportSize(new Dimension(250, myTable.getRowHeight() * 5));
        myTable.setShowGrid(false);
        myTable.setIntercellSpacing(new Dimension(0, 0));

        @NonNls InputMap inputMap = myTable.getInputMap();
        @NonNls ActionMap actionMap = myTable.getActionMap();

        // SPACE: toggle enable/disable
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "enable_disable");
        actionMap.put("enable_disable", new AbstractAction() {
            @Override
            public void actionPerformed(@NotNull ActionEvent e) {
                if (myTable.isEditing()) return;
                int[] rows = myTable.getSelectedRows();
                if (rows.length > 0) {
                    boolean valueToBeSet = false;
                    for (int row : rows) {
                        if (!parameterInfos.get(row).isEnabled()) {
                            valueToBeSet = true;
                            break;
                        }
                    }
                    for (int row : rows) {
                        parameterInfos.get(row).setEnabled(valueToBeSet);
                    }
                    myTableModel.fireTableRowsUpdated(rows[0], rows[rows.length - 1]);
                    TableUtil.selectRows(myTable, rows);
                }
            }
        });

        // F2: edit parameter name
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), "edit_parameter_name");
        actionMap.put("edit_parameter_name", new AbstractAction() {
            @Override
            public void actionPerformed(@NotNull ActionEvent e) {
                if (!myTable.isEditing()) {
                    int row = myTable.getSelectedRow();
                    if (row >= 0 && row < myTableModel.getRowCount()) {
                        TableUtil.editCellAt(myTable, row, MyTableModel.PARAMETER_NAME_COLUMN);
                    }
                }
            }
        });

        // make ENTER work when the table has focus
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "invoke_impl");
        actionMap.put("invoke_impl", new AbstractAction() {
            @Override
            public void actionPerformed(@NotNull ActionEvent e) {
                TableCellEditor editor = myTable.getCellEditor();
                if (editor != null) {
                    editor.stopCellEditing();
                }
                else {
                    onEnterAction();
                }
            }
        });

        // make ESCAPE work when the table has focus
        actionMap.put("doCancel", new AbstractAction() {
            @Override
            public void actionPerformed(@NotNull ActionEvent e) {
                TableCellEditor editor = myTable.getCellEditor();
                if (editor != null) {
                    editor.stopCellEditing();
                }
                else {
                    onCancelAction();
                }
            }
        });

        JPanel listPanel = ToolbarDecorator.createDecorator(myTable).disableAddAction().disableRemoveAction().createPanel();
        add(listPanel, BorderLayout.CENTER);
    }

    protected void updateSignature() {

    }

    protected void onEnterAction() {

    }

    protected void onCancelAction() {

    }

    private class MyTableModel extends AbstractTableModel implements EditableModel {
        public static final int CHECKMARK_COLUMN = 0;
        public static final int PARAMETER_NAME_COLUMN = 1;
        public static final int PARAMETER_TYPE_COLUMN = 2;

        @Override
        public void addRow() {
            throw new IllegalAccessError("Not implemented");
        }

        @Override
        public void removeRow(int index) {
            throw new IllegalAccessError("Not implemented");
        }

        @Override
        public void exchangeRows(int oldIndex, int newIndex) {
            if (oldIndex < 0 || newIndex < 0) return;
            if (oldIndex >= parameterInfos.size() || newIndex >= parameterInfos.size()) return;

            ParameterInfo old = parameterInfos.get(oldIndex);
            parameterInfos.set(oldIndex, parameterInfos.get(newIndex));
            parameterInfos.set(newIndex, old);

            fireTableRowsUpdated(Math.min(oldIndex, newIndex), Math.max(oldIndex, newIndex));
            updateSignature();
        }

        @Override
        public boolean canExchangeRows(int oldIndex, int newIndex) {
            if (oldIndex < 0 || newIndex < 0) return false;
            if (oldIndex >= parameterInfos.size() || newIndex >= parameterInfos.size()) return false;
            return true;
        }

        @Override
        public int getRowCount() {
            return parameterInfos.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case CHECKMARK_COLUMN: {
                    return parameterInfos.get(rowIndex).isEnabled();
                }
                case PARAMETER_NAME_COLUMN: {
                    return parameterInfos.get(rowIndex).getName();
                }
                case PARAMETER_TYPE_COLUMN: {
                    return parameterInfos.get(rowIndex).getTypeAsString();
                }
            }
            assert false;
            return null;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case CHECKMARK_COLUMN: {
                    parameterInfos.get(rowIndex).setEnabled((Boolean) aValue);
                    fireTableRowsUpdated(rowIndex, rowIndex);
                    myTable.getSelectionModel().setSelectionInterval(rowIndex, rowIndex);
                    updateSignature();
                    break;
                }
                case PARAMETER_NAME_COLUMN: {
                    ParameterInfo info = parameterInfos.get(rowIndex);
                    String name = (String) aValue;
                    if (JetNameSuggester.isIdentifier(name)) {
                        info.setName(name);
                    }
                    updateSignature();
                    break;
                }
            }
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case CHECKMARK_COLUMN:
                    return isEnabled();
                case PARAMETER_NAME_COLUMN:
                    return isEnabled() && parameterInfos.get(rowIndex).isEnabled();
                default:
                    return false;
            }
        }

        @NotNull
        @Override
        public Class getColumnClass(int columnIndex) {
            if (columnIndex == CHECKMARK_COLUMN) {
                return Boolean.class;
            }
            return super.getColumnClass(columnIndex);
        }
    }

    public List<ParameterInfo> getParameterInfos() {
        return KotlinPackage.filter(
                parameterInfos,
                new Function1<ParameterInfo, Boolean>() {
                    @Override
                    public Boolean invoke(ParameterInfo info) {
                        return info.isEnabled();
                    }
                }
        );
    }
}
