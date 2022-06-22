package hw_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Car {
    private String carName;
    private int power;
    Owner owner;
    private int cost;
    private int year;

}
