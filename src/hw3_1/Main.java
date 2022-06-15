package hw3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printable> arrayList = new ArrayList<>();
        arrayList.add(new Book("Garry", 3, true));
        arrayList.add(new Book("Potter", 23, true));
        arrayList.add(new Magazine("Male", 44));
        arrayList.add(new Magazine("Female", 14));

        for (Printable printable : arrayList){
            printable.print();
        }

    }

}
