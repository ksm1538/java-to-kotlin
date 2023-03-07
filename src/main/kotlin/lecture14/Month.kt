package lecture14

fun handleMonth(month: Month) {
    // when 을 이용해서 간편하게 Enum 을 사용할 수 있다.
    when(month) {

        Month.JANUARY -> {
            println("1월입니다")
        }

        Month.FEBRUARY -> {
            println("2월입니다")
        }

        Month.MARCH -> {
            println("3월입니다")
        }

    }
}
enum class Month(
    private val code: String
){
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar");
}
