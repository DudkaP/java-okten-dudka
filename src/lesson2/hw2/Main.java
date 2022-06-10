package lesson2.hw2;

public class Main {
    public static void main(String[] args) {
        Workstation workstation = new Workstation();
        workstation.setCooler(true);
        workstation.setCores(50);
        workstation.setHardDisks(4);
        workstation.setBattery(true);
        workstation.setKeyboard(true);
        workstation.setMonitor(false);
        workstation.setUsb(true);
        workstation.setWifi(true);

        System.out.println(workstation);

        Ultrabook ultrabook = new Ultrabook();
        ultrabook.setBattery(false);
        ultrabook.setKeyboard(true);
        ultrabook.setMonitor(true);
        ultrabook.setBrand("Viva");
        ultrabook.setTouchpad(false);
        ultrabook.setUsb(true);
        ultrabook.setWifi(true);

        System.out.println(ultrabook);
    }
}
