package HomeWork1;

public class Road extends Barrier {

    private int lenght;

    public Road(String name, int lenght) {
        super(name);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }


}
