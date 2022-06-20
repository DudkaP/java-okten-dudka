package hw_5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Pet implements Comparable<Pet>{
    private String nickname;

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
