package hw_1;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(33,"three", true));
        users.add(new User(11,"one", false));
        users.add(new User(11,"one", false));
        users.add(new User(22,"two", true));
        users.add(new User(44,"four", true));
        users.add(new User(55,"five", false));
        users.add(new User(66,"six", true));
        users.add(new User(66,"six", true));
        users.add(new User(77,"seven", true));
        users.add(new User(88,"eight", true));
        users.add(new User(99,"nine", false));
        users.add(new User(10,"ten", true));

        Stream<User> sorted = users.stream().distinct().sorted(Comparator.comparingInt(o -> o.getName().charAt(0)));
//        sorted.forEach(System.out::println);
//        Stream<User> usersLess4 = sorted.filter(user -> user.getName().length() < 4);
//        sorted.forEach(System.out::println);
//        Stream<User> usersId = sorted.filter(user -> user.getId() % 3 == 0);
//        Stream<User> usersId = sorted.filter(user -> user.getId() % 10 == 0);
//        usersId.forEach(System.out::println);

        Stream<Object> usersMap = sorted.map(user -> {
            int i = user.getId() * 3;
            user.setId(i);
            return user;
        });
        usersMap.forEach(System.out::println);


    }
}
