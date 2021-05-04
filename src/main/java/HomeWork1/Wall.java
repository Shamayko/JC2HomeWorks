package HomeWork1;

public class Wall extends Barrier {

    private int high;

    public Wall(String name, int high) {
        super(name);
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

}
