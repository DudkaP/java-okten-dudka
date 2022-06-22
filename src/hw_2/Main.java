package hw_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Max", 2000, 22);
        Owner owner1 = new Owner("Olya", 1945, 18);
        Owner owner2 = new Owner("Kolya", 1900, 12);
        Owner owner3 = new Owner("Flex", 2020, 42);
        Owner owner4 = new Owner("Dodik", 1890, 11);
        Owner owner5 = new Owner("Trouble", 1998, 7);
        Owner owner6 = new Owner("Second", 2015, 43);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda", 123.4, owner, 1000, 2018));
        cars.add(new Car("Renault", 345, owner1, 3442, 2000));
        cars.add(new Car("KIA", 342, owner2, 1030, 1999));
        cars.add(new Car("Oka", 987, owner3, 4533, 1983));
        cars.add(new Car("Smart", 765, owner4, 5643, 2011));
        cars.add(new Car("BMW", 123, owner5, 8653, 2001));
        cars.add(new Car("ZAZ", 345, owner6, 123, 1890));
    }
}
