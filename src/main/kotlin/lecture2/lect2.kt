package lecture2

fun main() {
    var str1: String? = null

    // println(str1.length)      null 가능한 타입에는 위에서 null 체크를 하지 않는 이상 바로 해당 타입의 메서드를 사용할 수 없다.
    println(str1?.length)       // 이와 같이 str1?로 메서드를 호출하면 가능하며, 이것을 Safe Call 이라고 함.(null 일 때 리턴 값은 null)
    println(str1?.length ?: 0)  // str1?.length의 값이 null 이면 0 반환. ?: 으로 null 일 때 사용할 값 or 구문을 지정 가능하며, 이것을 Elvis 연산자 라고 한다.

    var str2: String? = "ABC"
    println(str2!!.length)      // str2는 null이 가능한 변수지만, null이 절대 아니다라고 !!를 통해서 알려줌으로써 해당 타입의 메서드를 사용 가능하다.


}

