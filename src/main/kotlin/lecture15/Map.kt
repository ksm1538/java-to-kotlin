package lecture15

fun main() {
    val fruitMap = mutableMapOf<String, String>()            // mutableMapOf : 가변 map 생성
    val map = mapOf<String, String>("apple" to "사과")        // mapOf : 불변 map 생성 (key to value 로 표시)

    // (java) put (put도 사용 가능)
    fruitMap["apple"] = "사과"
    fruitMap["orange"] = "오렌지"

    // map 의 Key 만 가져와서 탐색
    for(key in fruitMap.keys)
        println("KEY : " + key + ", VALUE : " + fruitMap[key])

    // key 와 value 를 가져와서 탐색
    for((K, V) in fruitMap.entries)
        println("KEY : " + K + ", VALUE : " + V)
}
