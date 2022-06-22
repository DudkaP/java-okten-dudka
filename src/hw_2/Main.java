package hw_2;

import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Max", 33, 2);
        Owner owner1 = new Owner("Olya", 20, 18);
        Owner owner2 = new Owner("Kolya", 45, 12);
        Owner owner3 = new Owner("Flex", 50, 4);
        Owner owner4 = new Owner("Dodik", 30, 11);
        Owner owner5 = new Owner("Trouble", 25, 7);
        Owner owner6 = new Owner("Second", 19, 3);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda", 123, owner, 1000, 2018));
        cars.add(new Car("Renault", 345, owner1, 3442, 2000));
        cars.add(new Car("KIA", 342, owner2, 1030, 1999));
        cars.add(new Car("Oka", 987, owner3, 4533, 1983));
        cars.add(new Car("Smart", 765, owner4, 5643, 2011));
        cars.add(new Car("BMW", 123, owner5, 8653, 2001));
        cars.add(new Car("ZAZ", 345, owner6, 123, 1890));

//        Stream<Car> carStream = cars.stream().limit(cars.size() / 2).map(car -> {
//            int v = (int) (car.getPower() * 1.1);
//            car.setPower(v);
//            return car;
//        });
//        carStream.forEach(System.out::println);

//        Stream<Car> carStream = cars.stream().filter(car -> car.owner.getExperience() <= 5 && car.owner.getYear() >= 25).map(
//                car -> {
//                    car.owner.setExperience(car.owner.getExperience() + 1);
//                    return car;
//                }
//        );
//        carStream.forEach(System.out::println);

        Optional<Integer> reduce = cars.stream().map(car -> car.getCost()).reduce((integer, integer2) -> integer + integer2);
        //        OR
        //        Optional<Integer> reduce = summ.reduce((integer, integer2) -> integer + integer2);
        System.out.println(reduce.get());


    }
}
