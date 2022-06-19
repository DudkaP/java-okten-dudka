package hw_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skills> skills = new ArrayList<>();
        ArrayList<Skills> skills2 = new ArrayList<>();
        ArrayList<Skills> skills3 = new ArrayList<>();
        ArrayList<Skills> skills4 = new ArrayList<>();
        ArrayList<Skills> skills5 = new ArrayList<>();
        skills.add(new Skills("Sql", 12));
        skills2.add(new Skills("Sql", 12));
        skills2.add(new Skills("Js", 9));
        skills3.add(new Skills("Java", 11));
        skills3.add(new Skills("sdfvfsdf", 1));
        skills3.add(new Skills("asd", 23));
        skills4.add(new Skills("bfd", 4));
        skills4.add(new Skills("bfd", 4));
        skills4.add(new Skills("lk", 6));
        skills5.add(new Skills("Sql", 12));
        skills5.add(new Skills("Js", 9));
        skills5.add(new Skills("Java", 11));
        skills5.add(new Skills("sdfvfsdf", 1));
        skills5.add(new Skills("asd", 23));
        skills5.add(new Skills("bfd", 4));

        Car car = new Car("Mazda", 2010, 120);

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(new User(1, "Petya", "Simonov", "asd@asd.com", 13, Gender.MALE, skills, car));
        userTreeSet.add(new User(2, "Vasya", "Kozlov", "asd@asd.com", 35, Gender.MALE, skills5, car));
        userTreeSet.add(new User(3, "Nike", "Petrov", "asd@asd.com", 23, Gender.MIDDLE, skills2, car));
        userTreeSet.add(new User(4, "Olya", "Solomiy", "asd@asd.com", 67, Gender.FEMALE, skills, car));
        userTreeSet.add(new User(5, "Tanya", "Shevchuc", "asd@asd.com", 65, Gender.FEMALE, skills3, car));
        userTreeSet.add(new User(6, "Gena", "Tolstoy", "asd@asd.com", 19, Gender.MALE, skills, car));
        userTreeSet.add(new User(7, "Pasha", "Dudka", "asd@asd.com", 33, Gender.MALE, skills4, car));
        userTreeSet.add(new User(8, "Mariya", "Stefaniya", "asd@asd.com", 23, Gender.FEMALE, skills, car));
        userTreeSet.add(new User(9, "Lena", "Gloda", "asd@asd.com", 98, Gender.FEMALE, skills, car));
        userTreeSet.add(new User(10, "Sasha", "Chebata", "asd@asd.com", 34, Gender.MIDDLE, skills, car));
        System.out.println(userTreeSet);

    }
}
