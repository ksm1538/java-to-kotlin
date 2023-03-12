package lecture19

data class Abcdefghijklmnop(
    val name: String
)

// typealias를 이용해서 타입 별칭을 지정할 수 있다.
typealias myType = (Abcdefghijklmnop) -> Boolean
fun myFilter(abcdefghijklmnop: Abcdefghijklmnop, filter: myType) {

}

typealias mapStringWithAbcd = Map<String, Abcdefghijklmnop>
fun main() {
    var map: mapStringWithAbcd

}