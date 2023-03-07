package lecture12

fun main() {
    Person.Create.newBaby("baby")
    Person.newBaby("baby2")

    println(Singleton.num)
    Singleton.num = 2_000
    println(Singleton.num)
}

class Person private constructor(
    var name: String,
    var age: Int
){
    // static 이라는 키워드가 없고, companion object 로 사용해야 함
    // = 동반객체. 동반객체는 객체로 여겨진다.(객체에 이름을 설정하거나, 상속, 구현받을 수 있음)
    companion object Create{
        // const :
        private const val MIN_AGE = 1

        @JvmStatic      // Java 에서 companion object 이용 시, @JvmStatic 을 사용해야 한다.
        fun newBaby(name: String): Person{
            println("응애")
            return Person(name, MIN_AGE)
        }
    }
}

// 싱글톤 클래스 정의
// object: 싱글톤 생성 키워드
object Singleton {
    var num: Int = 1_000
}