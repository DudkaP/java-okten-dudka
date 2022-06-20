package hw_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Tuzik"));
        pets.add(new Pet("Musya"));
        pets.add(new Pet("11"));
        pets.add(new Pet("10"));

        Person person = new Person();
        person.setName("Max");

        ArrayList<Pet> pets1 = new ArrayList<>();
        pets1.add(new Pet("Rich"));
        pets1.add(new Pet("Kuzya"));
        pets1.add(new Pet("22"));
        pets1.add(new Pet("10"));

        Person person1 = new Person();
        person1.setName("Paul");

        ZooClub zooClub = new ZooClub();
        zooClub.getClub().put(person, pets);
        zooClub.getClub().put(person1, pets1);

//        System.out.println(zooClub.getClub().get(person));
//        System.out.println(zooClub.getClub().get(person1));
        System.out.println(zooClub.getClub().values());

//        zooClub.getClub().remove(person);
//        System.out.println(zooClub.getClub().values());


        System.out.println(pets.get(3));
        System.out.println(zooClub.getClub().values());

    }
}
