package lecture10

class Cat(
    species: String         // :을 쓸 때, 이처럼 타입을 쓰는 경우 변수명 앞에 띄어쓰기를 하지 않고
) : Animal(species, 4) {    // 상속을 받을 땐, 띄어쓰고 :을 쓴다. (extends 대신 : 사용)
    // 코틀린에서 상속받을 때, 상위 클래스의 생성자를 반드시 호출해야 함

    // Override를 할 땐, override라고 필수적으로 작성해야 한다.
    override fun sound() {
        println("냐옹")
    }
}