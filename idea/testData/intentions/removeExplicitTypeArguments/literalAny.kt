// IS_APPLICABLE: true
fun foo() {
    val x = <caret>Box<Any>(Any())
}

class Box<T>(t : T) {
    var value = t
}