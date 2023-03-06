package lecture10;

public class JavaCat extends JavaAnimal{
    public JavaCat(String species){
        super(species, 4);
    }
    
    @Override
    public void sound(){
        System.out.println("냐옹");
    }
}
