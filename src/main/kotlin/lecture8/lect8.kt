package lecture8

fun main() {
    println(findMin(5,8))

    // 직접 어떤 인자에 무슨 값을 넣을 지도 설정 가능하다. (Java 함수를 가져다 사용하는 경우에는 불가능)
    strPrint("Kotlin", newLine=false)

    println()
    // 가변인자 사용 1번
    println(sumAll(1,2,3,4,5))

    var numArr = arrayOf(1,2,3,4,5)
    println(sumAll(* numArr.toIntArray()))       // 배열로 넘기는 경우에는 *을 붙여줘야 한다.

}

// 함수가 하나의 값을 도출해낸다면, { } 블록대신 = 사용이 가능하다. (= 을 사용하는 경우 리턴타입을 생략 가능)
fun findMin(num1: Int, num2: Int) =
    if(num1 < num2)
        num1
    else
        num2

// 함수에 default 값을 Setting 할 수 있다.
fun strPrint(
    str: String = "Default String",
    num: Int = 5,
    newLine: Boolean = true
) {
    for(i in 1..num){
        if(newLine)
            println(str)
        else
            print(str)
    }
}

fun sumAll(vararg nums: Int): Int {
    var result = 0
    for (num in nums) {
        result += num
    }

    return result
}