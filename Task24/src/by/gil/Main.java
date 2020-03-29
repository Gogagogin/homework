package by.gil;

public class Main {

    public static void main(String[] args) {

        TwoPhaseNetwork lapTop = new TwoPhaseNetwork();
        BatteryTypeA firstClock = new BatteryTypeA();
        Watchs orient = new Watchs();
        ThreePhaseNetwork plita = new ThreePhaseNetwork();

        System.out.println("Наследованные свойтсва ноутбука");
        System.out.println("");
        lapTop.tecnhics();
        lapTop.electricalTecnhics();
        lapTop.networkTecn();
        lapTop.twoPhaseNetwork();
        System.out.println(" Я ноутбук");
        System.out.println("");
        System.out.println("Наследованные свойтсва настенных часов");
        System.out.println("");
        firstClock.tecnhics();
        firstClock.electricalTecnhics();
        firstClock.batteryTecn();
        firstClock.batteryTypeA();
        System.out.println(" Я Настенные часы");
        System.out.println("");
        System.out.println("Наследованные свойтсва механических часов");
        System.out.println("");
        orient.tecnhics();
        orient.nonElectricalTecnhics();
        orient.clocks();
        orient.watchs();
        System.out.println(" Я механические часы");
        System.out.println("");
        System.out.println("Наследованные свойтсва электроплиты");
        System.out.println("");
        plita.tecnhics();
        plita.electricalTecnhics();
        plita.networkTecn();
        plita.threePhaseNetwork();
        System.out.println(" Я кухнная плита");

    }

}
