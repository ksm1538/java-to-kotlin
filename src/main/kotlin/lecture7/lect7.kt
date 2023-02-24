package lecture7

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.IllegalArgumentException

fun main() {
    // 입력을 하는데도 불구하고, throws로 IOException을 하지 않는다.
    // Kotlin 에서는 모두 Unchecked Exception 이다. (즉, throws 할 필요X)
    var reader = BufferedReader(InputStreamReader(System.`in`))
    println(reader.readLine())
}

// try-catch (finally) 문법은 Java와 동일
fun parseIntOrThrow(str: String): Int {
    try{
        return str.toInt()
    } catch(e: NumberFormatException){
        throw IllegalArgumentException("${str}은 숫자가 아닙니다.")
    }
}

// try with resources 대신 use라는 것을 사용한다. (추후에 공부 예정)

