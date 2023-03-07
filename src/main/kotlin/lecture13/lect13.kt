package lecture13

fun main() {

}

class Company(
    val address: String,
    val department: Department
) {
    // 중첩 클래스 사용 예(기본적으로 바깥 클래스를 참조하지 않음)
    // 만약 바깥 클래스를 참조하고 싶다면 inner 키워드 사용 ( 가르킬 때는 this@바깥클래스. 권장 X)
    class Department(
        private var name: String
    )
}