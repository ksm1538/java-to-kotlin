package lecture12

fun main(){
    // 익명 클래스의 경우, object : 타입 { } 으로 표현할 수 있다.
    eatSomething(object : Eatable {
        override fun eat() {
            println("냠냠")
        }

        override fun drink() {
            println("꿀꺽")
        }
    })
}

private fun eatSomething(eatable: Eatable){
    eatable.eat()
    eatable.drink()
}