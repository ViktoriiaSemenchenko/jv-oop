package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Truck(), new Excavator()};

        for (Machine m: machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
