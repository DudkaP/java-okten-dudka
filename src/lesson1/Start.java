package lesson1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        System.out.println("test");
        User user = new User();

        ArrayList<String> skills = user.getSkills();
        skills.add("one");
        skills.add("two");
        skills.add("three");

        User user1 = new User(12,"Vasya",skills);

//        System.out.println(user1.getId());
//        System.out.println(user1.getName());
//        System.out.println(user1);
//        for (int i = 0; i < skills.size(); i++) {
//            System.out.println(skills.get(i));
//        }
        for (String skill : skills) {
            System.out.println(skill);
        }

    }
}
