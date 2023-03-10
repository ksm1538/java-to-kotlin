package lecture18

data class User(
    val id: Long,
    val name: String,
    val age: Long,
    val money: Long
) {
    fun nullOrValue() {
        this == null
    }
}

fun main() {
    val users =
        listOf(
            User(1,"홍길동", 4, 1_000, ),
            User(2,"홍길동", 6, 2_000, ),
            User(3,"홍길동", 5, 3_000, ),
            User(4,"홍길동", 7, 4_000, ),
            User(5,"강백호", 10, 5_000, ),
            User(6,"강백호", 11, 10_000, ),
            User(7,"강호동", 22, 50_000, )
        )

    // java stream 처럼 filter 를 이용해서 원하는 필터를 걸 수 있음
    val gildongs = users.filter {it.name == "홍길동"}
    println(gildongs)

    // 필터 내의 로직에서 index 를 확인할 때 아래와 같이 사용 가능하다.
    val gildongsWithIdx = users.filterIndexed { idx, user ->
        println(idx)
        user.name == "홍길동"
    }
    println(gildongsWithIdx)

    // .map을 이용해서 특정한 형태로 추출할 수 있다. (여기서도 마찬가지로 index 가 필요하다면, mapIndexed를 사용하면 된다.)
    var gildongsMoney = users.filter {it.name == "홍길동"}.map{user -> user.money}
    println(gildongsMoney)

    // map의 결과가 null이 아닌 것을 조회
    var gildongsMoneyNotNull = users.filter {it.name == "홍길동"}.mapNotNull{user -> user.nullOrValue()}

    // all : 람다의 결과가 모두 참이라면 true 반환, 하나라도 거짓이라면 false 반환
    var allLambda = users.all{it.name == "홍길동"}
    println("allLambda : $allLambda")

    // none : 람다의 결과가 모두 거짓이라면 true 반환, 하나라도 참이라면 false 반환
    var noneLambda = users.none{it.name == "김멍목"}
    println("noneLambda : $noneLambda")

    // any : 람다의 결과가 하나라도 참이라면 true 반환, 모두 거짓이라면 false 반환
    var anyLambda = users.any{it.name == "홍길동"}
    println("anyLambda : $anyLambda")

    // count : 말그대로 갯수를 세는 기능
    var gildongsCount = users.count{it.name == "홍길동"}
    println("gildongsCount : $gildongsCount")

    // sortedBy : 오름차순 정렬, sortedByDescending : 내림차순 정렬
    var moneySort = users.sortedBy { it.money }
    println(moneySort)
    var moneySortReverse = users.sortedByDescending { it.money }
    println(moneySortReverse)

    // distinctBy : 람다의 결과를 기준으로 중복 제거
    var userNames = users.distinctBy {user -> user.name}.map { user -> user.name }
    println("userNames : $userNames")

    // first : 첫번 째 값을 조회 (null 이면 NPE), firstOrNull : 첫번 째 값 조회(null 가능)
    // last : 마자막 값을 조회 (null 이면 NPE), lastOrNull : 마지막 값 조회(null 가능)
    var userFirst = users.first{user -> user.name == "강백호"}
    println("userFirst : $userFirst")

    // groupBy : 사람 이름을 Key로 하는 Map을 반환(value : List<User>)
    val nameMapList: Map<String, List<User>> = users.groupBy { it.name }
    println(nameMapList)

    val customMapList: Map<String, List<Long>> = users.groupBy({user->user.name}, {user->user.money})
    println(customMapList)

    // associateBy : 사람 id을 Key로 하는 Map을 반환.(value : User. 단일 객체로 반환)
    val nameMap: Map<Long, User> = users.associateBy { user -> user.id }
    println(nameMap)

    val customMap: Map<Long, Long> = users.associateBy({ user -> user.id}, { user -> user.money })
    println(customMap)

    val map: Map<String, List<User>> = users.groupBy { user->user.name }
        .filter{(K,V) -> K == "홍길동"}
    println(map)

    // flatMap : java와 기능 동일, flatten : 중첩 클래스 해제
}