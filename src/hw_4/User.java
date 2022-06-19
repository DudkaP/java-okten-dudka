package hw_4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Comparable<User>{
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList <Skills> skills;
    private Car car;

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.skills.size();
    }
}
