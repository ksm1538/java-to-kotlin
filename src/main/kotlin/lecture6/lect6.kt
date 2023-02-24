package lecture6

fun main() {
    var numArr = listOf(1,2,3,4,5)

    println("[1]")
    // (java) [foreach] int num : numArr
    for(num in numArr){
        println(num)
    }

    println()
    println("[2]")
    // (java) for(int i=0; i<5; i++)
    for(i in 0..4){
        println(numArr[i])
    }

    println()
    println("[3]")
    // downTo를 하면 반대로 수를 낮추면서 반복할 수 있다.
    // (java) for(int i=4; i>=0; i--)
    for(i in 4 downTo 0){
        println(numArr[i])
    }

    println()
    println("[4]")
    // step을 이용하면 몇개씩 증가시킬 지 설정할 수 있다.
    // (java) for(int i=0; i<5; i+=2)
    for(i in 0..4 step 2){
        println(numArr[i])
    }

    // while & do-while은 Java와 같다.
}