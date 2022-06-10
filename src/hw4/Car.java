package hw4;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private String model;
    private int year;
    private int power;

    @Override
    public String toString() {
        return "{" +
                "model: '" + model + '\'' +
                ", year: " + year +
                ", power: " + power +
                '}';
    }
}
