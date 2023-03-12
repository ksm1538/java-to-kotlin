package lecture19

fun main() {
    var num = 5

    // takeIf : 람다식의 결과가 true: 그 값을 반환, false: null 반환
    var result1 = num.takeIf {n -> n>5}
    println(result1)

    // takeUnless : 람다식의 결과가 true: null 반환, false: 그 값을 반환
    var result2 = num.takeUnless {n -> n>5}
    println(result2)
}