package HomeWork1;

public class Cat implements JumpAndRun {

    /**
     * Создаем переменные имени, стамины и максимальной высоты прыжка.
     * Кошки прыгают выше всех.
     */

    protected final int MAX_JUMP_CM = 200;
    private String name;
    private int stamina;

    /**
     * Создаем конструктор, гетер и сеттер стамины.
     * @param name
     * @param stamina
     */

    public Cat(String name, int stamina) {
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
     * Учим котов бегать.
     * @param barrier
     */

    @Override
    public void run(Barrier barrier) {
        if (this.stamina > 0) {
            setStamina(getStamina() - barrier.getLenght());
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
     * Учим котоы прыгать. Коты тратят врое меньше стамины на прыжки, чем все остальные.
     * Вот она сила ночного тыгыдыка.
     * Если экземпляр не может справится с высотой стены
     * (она превышает максимлаьную возможность прыжка вида особи)
     * то экземпляр тратит все силы пытаясь преодолеть стену и сходит с полосы препятствий.
     * @param barrier
     */

    @Override
    public void jump(Barrier barrier) {
        if (this.stamina > 0) {
            if (this.MAX_JUMP_CM >= barrier.getHigh()) {
                setStamina(getStamina() - (barrier.getHigh() / 3));
                System.out.println(this.name + " попытался перепрыгнуть " + barrier.getName() + '.');
                if (this.stamina >= 0) {
                    System.out.println("И успешно справился с задачей.");
                } else {
                    System.out.println("Но ему не хватило сил.");
                }
            } else {
                System.out.println(this.name + " потратил все силы пытаясь перепрыгнуть " + barrier.getName() + '.');
                setStamina(0);
            }
        } else {
            System.out.println(this.name + " не достает сил чтобы прыгать через " + barrier.getName() + '.');
        }

    }
}
