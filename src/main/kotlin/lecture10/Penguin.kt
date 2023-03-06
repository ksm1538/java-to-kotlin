package lecture10

class Penguin(
    species: String
) : Animal(species, 2), Swimmable, Walkable{
    private val wingCount: Int = 2;

    override fun sound() {
        println("꿱꿱")
    }

    // val(final) 멤버 변수를 override하려면 open을 사용해야함
    override val legCount: Int
        get() = super.legCount + wingCount      // 상위 클래스에 접근하는 키워드: super

    // 중복되는 인터페이스를 지정할 땐, super<타입>.함수 로 사용한다.
    override fun act() {
        super<Swimmable>.act()
        super<Walkable>.act()
    }

    override fun walk() {
        println("펭귄 워킹")
    }
}