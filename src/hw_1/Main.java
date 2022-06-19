package hw_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "a", 11));
        users.add(new User(4, "dddd", 44));
        users.add(new User(2, "bb", 22));
        users.add(new User(5, "eeeee", 55));
        users.add(new User(3, "ccc", 33));
        users.add(new User(6, "ffffff", 66));

        users.sort(Comparator.comparingInt(o -> o.age));
        System.out.println(users);
        users.sort((o1, o2) -> o2.age - o1.age);
        System.out.println(users);
        users.sort(Comparator.comparingInt(o -> o.name.length()));
        System.out.println(users);
        users.sort((o1, o2) -> o2.name.length() - o1.name.length());
        System.out.println(users);
    }
}
