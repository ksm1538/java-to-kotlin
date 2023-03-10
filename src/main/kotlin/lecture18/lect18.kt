package lecture18

class User(
    val id: Long,
    val name: String,
    val age: Long,
    val money: Long
)

fun main() {
    val games =
        listOf(
            User(1,"홍길동", 4, 1_000, ),
            User(2,"홍길동", 6, 2_000, ),
            User(3,"홍길동", 5, 3_000, ),
            User(4,"홍길동", 7, 4_000, ),
            User(5,"강백호", 10, 5_000, ),
            User(6,"강백호", 11, 10_000, ),
            User(7,"강호동", 22, 50_000, )
        )


}