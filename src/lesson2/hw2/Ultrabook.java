package lesson2.hw2;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Ultrabook extends Laptop{
    private Boolean touchpad;
    private String brand;

    @Override
    public String toString() {
        return "Ultrabook{" +
                "touchpad=" + touchpad +
                ", brand='" + brand + '\'' +
                "} " + super.toString();
    }
}
