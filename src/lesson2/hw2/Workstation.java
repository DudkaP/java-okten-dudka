package lesson2.hw2;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Workstation extends Laptop{
    private Boolean cooler;
    private int hardDisks;
    private int cores;


    @Override
    public String toString() {
        return "Workstation{" +
                "cooler=" + cooler +
                ", hardDisks=" + hardDisks +
                ", cores=" + cores +
                "} " + super.toString();
    }
}
