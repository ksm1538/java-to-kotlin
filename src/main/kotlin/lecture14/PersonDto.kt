package lecture14

// data class 를 사용하면, equals(), toString(), hashCode(), builder() 를 자동으로 생성해준다.
data class PersonDto(
    private val name: String,
    private val age: Int
)