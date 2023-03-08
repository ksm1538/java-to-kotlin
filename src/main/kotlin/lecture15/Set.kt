package lecture15

fun main() {
    val numberSet = setOf(1,2,3)                // setOf() : 불변 Set 생성
    val editableNumberSet = mutableSetOf(1,2,3) // mutableSetOf() : 가변 Set 생성(기본 구현체: LinkedHashSet)

    for(number in numberSet)
        println(number)

    for((a, b) in numberSet.withIndex())
        println("Index : $a, Value: $b")
}