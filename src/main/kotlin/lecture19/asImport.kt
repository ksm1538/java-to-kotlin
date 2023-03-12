package lecture19

import lecture18.User

// data class는 componentN 함수를 알아서 만들어준다.
// 참고) componentN 함수는 직접 명시할 수도 있다.
data class Cup(
    val name: String,
    val price: Int
)

fun main() {
    val cup = Cup("머그컵", 5_000)

    // ComponentN 함수가 있을 떄
    val (a, b) = cup
    println("a: $a, b: $b")
}
