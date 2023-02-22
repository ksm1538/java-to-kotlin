package lecture3

import lecture1.Person

fun main() {
    // Kotlin은 처음 선언된 값의 타입으로 변수의 타입을 정해준다.
    var num1 = 1        // Int
    var num2 = 1L       // Long
    var num4 = 1.0      // Double
    var num3 = 1.0f     // Float

    // 기본 타입의 변환의 경우 명시적으로 변환을 해줘야 한다. (Java의 경우 암묵적으로 변환)
    var number1 = 1
    //  var number2 = number1       X
    var number2 = number1.toLong()  // toLong으로 명시적으로 형변환을 해야한다.

    // nullable 변수를 Long으로 변환하는 예
    var nullableNum:Int? = 1
    var number3:Long = nullableNum?.toLong() ?: 0L

    // (Kotlin) Any = (Java) Object
    // 모든 타입의 최상위 타입 = Any
    var anyVar:Any

    var name = "김멍목"
    var age = 28

    // 문자 조작 방법
    // = (java) String s = String.format("내 이름은 %s, 나이는 %s", name, age);
    var s = "내 이름은 ${name}, 나이는 ${age}"

    // = (java) s.charAt(0)
    var s1 = s[0]

    // 여러줄을 사용하는 경우, """ """ 을 사용하면 된다.
    var newLineStr = """
        내이름은 ${name}
        나이는 ${age}
    """.trimIndent()


}

fun oddFun(): Nothing{
    throw Exception("Nothing")
}

fun printPersonName(obj: Any)    {
    if(obj is Person){                  // (Kotlin) is = (Java) instanceof      (반대로 !is 가능)

        // (Kotlin)  obj as Person = (Java)  (Person) obj
        var person = obj as Person      // Person Type이 아닌데, Person Type으로 형변환 시, ClassCastException 발생. (만약, as?를 사용했다면 null 반환)
        println(person.name)

        println(obj.name)               // 위에서 Person인 지 체크를 했기 때문에 알아서 Person으로 변환이 가능하다.
    }
}


fun printPersonNameNullable (obj: Any?)    {
    if(obj is Person){                  // (Kotlin) is = (Java) instanceof
        var person = obj as? Person      // (Kotlin)  obj as Person = (Java)  (Person) obj
        println(person?.name)

        println(obj?.name)               // 위에서 Person인 지 체크를 했기 때문에 알아서 Person으로 변환이 가능하다.
    }
}