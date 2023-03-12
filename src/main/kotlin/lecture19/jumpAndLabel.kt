package lecture19

fun main() {

    // 문자@ : label 설정.
    // @문자 : 해당 문자의 label 명시
    label1@ for(i in 1..10){
        for(j in 1..10){
            println("i: $i, j: $j")
            if(j>=5)
                break@label1
        }
    }
}