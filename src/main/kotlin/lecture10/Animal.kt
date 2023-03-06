package lecture10

abstract class Animal(
    protected val species: String,

    //  멤버 변수를 override하려면 open을 사용해야함(추상 변수의 경우, open을 안붙여줘도 가능)
    protected open val legCount: Int){
    abstract fun sound()
}