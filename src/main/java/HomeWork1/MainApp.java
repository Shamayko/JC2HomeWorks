package HomeWork1;

public class MainApp {
    public static void main(String[] args) {


        JumpAndRun[] jumpAndRuns = {
                new Cat("Vaska", 550),
                new Cat("Toshka", 300),
                new Human("Vasiliy", 600),
                new Human("Anatoliy", 450),
                new Robot("Vasinator", 500),
                new Robot("RoboToliy2000", 2000)
        };

        Barrier[] barriers = {
                new Road("Vyazov Street", 100),
                new Wall("Great China Wall", 40),
                new Road("Highway to HEll", 200),
                new Wall("Berlinskaya Wall", 110),
                new Road("Silent Hill Main Street", 50)

        };


        for (JumpAndRun jumpAndRun : jumpAndRuns) {
            for (Barrier barrier : barriers) {
                if (barrier instanceof Wall) {
                    jumpAndRun.jump(barrier);
                }
                if (barrier instanceof Road) {
                    jumpAndRun.run(barrier);
            }
        }
            System.out.println();
    }


}
}
