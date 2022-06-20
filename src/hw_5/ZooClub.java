package hw_5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ZooClub{
    private Map <Person, List <Pet>> club = new HashMap<>();


}
