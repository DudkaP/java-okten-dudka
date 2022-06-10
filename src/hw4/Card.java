package hw4;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Card {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String gender;
    private AddSkills skills;
    private Car car;

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", email: '" + email + '\'' +
                ", age: " + age +
                ", gender: '" + gender + '\'' +
                ", skills: " + skills +
                ", car: " + car +
                '}';
    }
}
