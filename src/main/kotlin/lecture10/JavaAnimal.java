package lecture10;

public abstract class JavaAnimal {
    protected final String species;
    protected final int legCount;

    public JavaAnimal(String species, int legCount) {
        this.species = species;
        this.legCount = legCount;
    }

    public String getSpecies() {
        return species;
    }

    public int getLegCount() {
        return legCount;
    }

    abstract public void sound();
}
