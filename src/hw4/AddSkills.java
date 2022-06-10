package hw4;

import lombok.*;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AddSkills {
    private ArrayList<String> allSkills = new ArrayList<>();

    public void addSkill(String skill){
        this.allSkills.add(skill);
    }

    @Override
    public String toString() {
        return allSkills.toString();
    }
}
