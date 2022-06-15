package hw3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Baraban(23.4));
        instruments.add(new Guitar(24));
        instruments.add(new Truba(56));

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
