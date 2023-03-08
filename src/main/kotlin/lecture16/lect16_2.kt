package lecture16

fun main() {
    // 일반적인 함수 호출
    println(8.minus2(5))
    // 중위 함수 방식 호출
    println(8 minus2 5)
}
// infix : 중위 함수 ( param1 minus2 param2 와 같이 함수를 호출할 수 있게 됨)
// 멤버함수에도 붙일 수 있다.
infix fun Int.minus2(num: Int): Int = this - num