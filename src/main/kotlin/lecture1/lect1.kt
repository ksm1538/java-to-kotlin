package lecture1

fun main(){

    /** var VS val */
    // var : 가변, val(불변. java final)
    var num1 = 6
    num1 = 7

    val num2 = 0
    // num2 = 1


    /** 타입 지정 */
    // 타입 지정 시, 변수이름:타입 으로 지정
    var num3:Long = 5L

    // Java와는 다르게 기본적으로 모든 변수에는 null이 들어갈 수 없도록 설정되어 있다.
    // 타입을 지정할 때 뒤에 ?를 붙이면 null을 넣을 수 있다.
    // 참고로, 프로그래머가 박싱과 언박싱을 신경쓰지 않아도 된다. (kotlin에서 적절하게 처리)
    var num4:Long? = null


    /** 초기화 */
    // 초기화되지 않은 객체는 사용 불가
    var num5:Long
    val num6:Long

    // println(num4 + num5)


    /** 객체 인스턴스 생성 방법 */
    // 타입은 var, val로 사용하며, new 연산자를 사용하지 않는다.
    val person = Person("김멍목")

}