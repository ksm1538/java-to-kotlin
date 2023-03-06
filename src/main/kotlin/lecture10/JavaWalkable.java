package lecture10;

public interface JavaWalkable {
    default void act(){
        System.out.println("걷는 중");
    }
}
