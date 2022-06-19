package hw_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skills> skills = new ArrayList<>();
        skills.add(new Skills("Sql", 12));
        skills.add(new Skills("Js", 9));
        skills.add(new Skills("Java", 11));

        Car car = new Car("Mazda", 2010, 120);

        HashSet<User> usersHashSet = new HashSet<>();
        usersHashSet.add(new User(1, "Petya", "Simonov", "asd@asd.com", 13, Gender.MALE, skills, car));
        usersHashSet.add(new User(2, "Vasya", "Kozlov", "asd@asd.com", 35, Gender.MALE, skills, car));
        usersHashSet.add(new User(3, "Nike", "Petrov", "asd@asd.com", 23, Gender.MIDDLE, skills, car));
        usersHashSet.add(new User(4, "Olya", "Solomiy", "asd@asd.com", 67, Gender.FEMALE, skills, car));
        usersHashSet.add(new User(5, "Tanya", "Shevchuc", "asd@asd.com", 65, Gender.FEMALE, skills, car));
        usersHashSet.add(new User(6, "Gena", "Tolstoy", "asd@asd.com", 19, Gender.MALE, skills, car));
        usersHashSet.add(new User(7, "Pasha", "Dudka", "asd@asd.com", 33, Gender.MALE, skills, car));
        usersHashSet.add(new User(8, "Mariya", "Stefaniya", "asd@asd.com", 23, Gender.FEMALE, skills, car));
        usersHashSet.add(new User(9, "Lena", "Gloda", "asd@asd.com", 98, Gender.FEMALE, skills, car));
        usersHashSet.add(new User(10, "Sasha", "Chebata", "asd@asd.com", 34, Gender.MIDDLE, skills, car));
        System.out.println(usersHashSet);

        Iterator<User> iterator = usersHashSet.iterator();
        while (iterator.hasNext()) {
            User userIterator = iterator.next();
            if (userIterator.getGender() == Gender.MALE) {
                iterator.remove();
            }
        }
        System.out.println(usersHashSet);
    }
}
