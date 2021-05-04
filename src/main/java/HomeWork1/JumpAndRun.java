package HomeWork1;

public interface JumpAndRun {


    default void run(Barrier barrier) {
        System.out.println("Runing");
    }

    default void jump(Barrier barrier) {
        System.out.println("Jumping");
    }


}
