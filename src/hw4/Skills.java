package hw4;

import lombok.*;

//@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Skills {

    private SkillsTitle skillsTitle;
    private int exp;

    @Override
    public String toString() {
        return "{title='" + skillsTitle + '\'' +
                ", exp=" + exp + "}";
    }
}
