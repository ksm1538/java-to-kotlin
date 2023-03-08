package lecture16

fun main() {
    var str = "hhhhhhhh"
    println(str.firstChar())
}

// 확장 함수 : 기존에 있던 클래스의 멤버 함수를 임의로 생성할 수 있는 기능 (클래스의 private, protected 멤버를 가져올 수 없음)
fun String.firstChar(): Char {
    return this[0]  // this 를 이용해서 실제 클래스 안의 값에 접근할 수 있다.
}

// 확장 함수처럼 확장 프로퍼티로서도 사용 가능하다.
val String.firstChar: Char
    get() = this[0]