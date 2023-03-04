package lecture9;

public class JavaPerson {
    private final String name;      // final. 즉, 변경할 수 없는 객체는 setter는 불가능하고 생성자를 이용해서 데이터를 초기화해야한다.
    private int age;

    public JavaPerson(String name, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException(String.format("나이는 1살 이상이어야 합니다."));
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
