package lecture15

fun main() {
    val numberList = listOf(1,2,3)                  // listOf : 불변 리스트 생성
    val emptyNumberList = emptyList<Int>()          // emptyList<>() 로 빈 리스트를 만들 때, 타입을 추론할 수 없을 경우 타입을 명시해줘야 한다.

    val editablenumberList = mutableListOf(1,2,3)   // mutableListOf() : 가변 리스트 생성
    editablenumberList.add(4)

    // 리스트에 직접 접근
    println(numberList.get(0))
    println(numberList[0])

    // 1) Java 의 foreach 처럼 사용
    println("[1]")
    for(number in numberList){
        println(number)
    }

    // 2) withIndex() 사용
    println("[2]")
    for((index, value) in editablenumberList.withIndex()){
        println("Index: $index, Value: $value")
    }
}