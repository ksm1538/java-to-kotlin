package lecture10

interface Walkable {
    fun act(){
        println("걷는 중")
    }

    // 추상 메서드는 아래처럼 선언만 하면 된다.
    fun walk()
}