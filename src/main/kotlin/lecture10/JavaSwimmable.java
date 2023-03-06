package lecture10;

public interface JavaSwimmable {
    default void act(){
        System.out.println("수영 중");
    }
}
