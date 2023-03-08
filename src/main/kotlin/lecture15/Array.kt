package lecture15

fun main() {
    val array = arrayOf("가", "나")

    // 1) Java 처럼 일반적인 반복문으로 접근하는 방법
    println("[1]")
    for(i in array.indices) {           // indices : 배열의 범위를 나타냄(0 ~ 마지막 index)
        println("Index : " + i + ", Value : " + array[i])
    }

    val array2 = array.plus("다")    // 배열을 추가해서 반환할 수 있다.

    // 2) index, value 를 반복문에서 얻는 방법
    println("[2]")
    for((index, value) in array2.withIndex()) {      // withIndex()를 이용하면 index, value 를 가져올 수 있다.
        println("Index : $index, Value : $value")
    }
}