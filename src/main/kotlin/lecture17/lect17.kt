package lecture17

class Game(
    val name: String,
    val price: Int
)

fun main() {
    val gameShop =
        listOf(
            Game("lol", 1_000),
            Game("lol", 1_000),
            Game("lol", 2_000),
            Game("lol", 3_000),
            Game("maple", 1_000),
            Game("maple", 3_000),
            Game("diablo", 10_000)
        )

    // 익명함수를 사용한 방법
    // 함수의 파라미터 및 리턴타입 설정은 생략 가능하다. (Game) -> Boolean
    var isLol: (Game) -> Boolean = fun(game: Game): Boolean {
        return game.name == "lol"
    }

    // 람다 표현식을 이용한 방법
    // 함수의 파라미터 및 리턴타입 설정은 생략 가능하다. (Game) -> Boolean
    var isLol2: (Game) -> Boolean = { game -> game.name == "lol" }

    // 호출방법 1
    isLol(gameShop[0])

    // 호출방법 2
    isLol.invoke(gameShop[0])

    // Filter를 이용한 방법 1
    filterGames(gameShop, isLol)

    // Filter를 이용한 방법 2
    filterGames(gameShop) {game: Game -> game.name == "lol"}

    // Filter를 이용한 방법 3
    // 람다로 작성 시, 파라미터가 한 개라면 it 키워드로 직접 참조가 가능하다.
    filterGames(gameShop) {it.name == "lol"}
}

private fun filterGames(
    gameShop: List<Game>,
    filter: (Game) -> Boolean   // 함수의 파라미터 및 리턴타입 설정
): List<Game> {
    val games = mutableListOf<Game>()       // 가변 리스트 정의
    for(game in games){
        if(filter(game)){
            games.add(game)
        }
    }
    return games
}

