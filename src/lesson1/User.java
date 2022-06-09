package lesson1;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"id"})
public class User {
    private int id;
    private String name;
    private ArrayList<String> skills = new ArrayList<>();


//    public User() {
//    }
//    public User(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
