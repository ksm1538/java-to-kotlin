package lecture5

fun main() {
    println(isPostiveOrNagtive(20))
    println(isZeroToTen(9))
    println(isZeroToTen(599))
}

// void 생략 가능
fun isMale(data: String) {
    if(data == "male"){
        throw IllegalAccessException("${data}로 조건에 부합하지 않습니다.")
    }
    else{
        println("${data}로 조건에 부합하지 않습니다.")
    }
}

// Kotlin에서의 if는 Expression으로 값을 바로 대입할 수 있다. (그러므로, 삼항연산자가 코틀린에는 없음)
fun isPostiveOrNagtive(num: Int): String{

    return if(num > 0) "양수입니다"
        else if(num == 0) "0 입니다"
        else "음수입니다"
}

// in .. 을 사용하면 보다 간편하게 범위를 지정할 수 있다.
fun isZeroToTen(num: Int): Boolean{
    // (java) (0 <= num && num <= 10)
    return num in 0..10
}

// (java) switch case 문 = (kotlin) when
// when에 변수를 할당하지 않아도 사용 가능하다.
fun numToEng(num: Int): String{
    return  when(num){
        0 -> "zero"
        1 -> "one"
        2 -> "two"
        in 3..10 -> "three ~ ten"
        else -> "I can't"
    }
}