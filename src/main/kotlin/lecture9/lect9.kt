package lecture9

fun main() {
    val kotlinPerson = KotlinPerson("김멍목", 27)

    // getter, setter 사용 시, .(점) 을 이용해서 접근 가능
    println("이름 : " + kotlinPerson.name + ", 나이 (변경 전) : " + kotlinPerson.age)
    kotlinPerson.age = 28
    println("변경 후 : " + kotlinPerson.age)

    val kotlinPerson2 = KotlinPerson("김멍목2")

}
// 생성자를 constructor(생략가능) 를 이용해서 바로 설정해줄 수 있다. (생성자의 변수를 설정해주면서, 멤버 변수들을 정의할 수 있다.)
// 클래스와 함께 선언되는 생성자를 주 생성자라고 한다.
class KotlinPerson constructor(
    val name: String,        // get() 을 사용하기 위해서, 아래에 정의
    age: Int
) {
    var age = age
        // Custom Getter
        get() {
            // name을 호출하면, 호출하는 즉시 getter가 호출되므로 무한루프 발생
            // 이런 경우를 대비해서, field라는 예약어로 사용
            return field + 10       // getter 호출 시, 10을 더해서 반환
        }
        // Custom Setter
        set(data) {
            field = data;
            println("age Setter : " + field)
        }
    // init : 생성자가 호출되는 시점에 호출되는 함수
    init {
        println(" == init == ")
        if(age <= 0) {
            throw IllegalArgumentException("나이는 1살 이상이어야 합니다.")
        }
    }

    // 보조 생성자. consturctor 키워드를 이용해서 정의할 수 있으며, 객체를 생성할 떈 반드시 주생성자(this)를 이용해야 함
    // 하지만, 코틀린에서는 부 생성자보단 Default Parameter, 정적 팩토리 메서드를 사용하는 것을 권장함
    constructor(name: String) : this(name,1) {
        println("부생성자 입니다.")
    }

    /** 성인인지 체크 **/
    // 함수 형식
    fun isAdult1() : Boolean {
        return this.age >= 20
    }

    // 프로퍼티 형식
    val isAdult2: Boolean
        get() = this.age >= 20
        /*
        =   get() {
                return this.age >= 20
            }
         */
}
// 멤버 변수만 있고, 내부 메서드가 없는 경우 아래처럼 중괄호 생략 가능
/*
{

    // 변수 타입의 경우, 생성자를 이용해서 유추할 수 있기 때문에 생략 가능
    // 생성자에서 아예 선언을 합쳐버림
    val name = name
    val age = age
}
*/