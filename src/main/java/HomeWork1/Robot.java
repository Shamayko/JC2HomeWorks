package HomeWork1;

public class Robot implements JumpAndRun {

    /**
     * Создаем переменные имени, стамины и максимальной высоты прыжка.
     * Роботы прыгают ниже всех.
     */

    protected final int MAX_JUMP_CM = 60;
    private String name;
    private int stamina;

    /**
     * Создаем конструктор, гетер и сеттер стамины.
     * @param name
     * @param stamina
     */

    public Robot(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    /**
     * Учим роботов бегать. Роботы тратят вдвое меньше стамины на бег, чем все остальные.
     * @param barrier
     */

    @Override
    public void run(Barrier barrier) {
        if (this.stamina > 0) {
            setStamina(getStamina() - (barrier.getLenght() / 2));
            System.out.println(this.name + " побежал по улице " + barrier.getName() + '.');
            if (this.stamina >= 0) {
                System.out.println("И успешно справился с задачей.");
            } else {
                System.out.println("Но ему не хватило сил добежать до конца.");
            }
        } else {
            System.out.println(this.name + " не достает сил и смелости бежать по " + barrier.getName() + '.');
        }
    }

    /**
     * Учим роботов прыгать. Роботы тратят вдвое меньше стамины на прыжки, чем все остальные
     * хоть и прыгают довольно не высоко.
     * Если экземпляр не может справится с высотой стены
     * (она превышает максимлаьную возможность прыжка вида особи)
     * то экземпляр проламывает стену и двигается дальше (хоть и тратит на это много стамины).
     * @param barrier
     */

    @Override
    public void jump(Barrier barrier) {
        if (this.stamina > 0) {
            if (this.MAX_JUMP_CM >= barrier.getHigh()) {
                setStamina(getStamina() - (barrier.getHigh() / 2));
                System.out.println(this.name + " попытался перепрыгнуть " + barrier.getName() + '.');
                if (this.stamina >= 0) {
                    System.out.println("И успешно справился с задачей.");
                } else {
                    System.out.println("Но ему не хватило сил.");
                }
            } else {
                System.out.println(this.name + " не смог перепрыгнуть " + barrier.getName() + " и проломил ее вместо этого.");
                setStamina(getStamina()-500);
            }
        } else {
            System.out.println(this.name + " не достает сил чтобы прыгать через " + barrier.getName() + '.');
        }

    }
}
