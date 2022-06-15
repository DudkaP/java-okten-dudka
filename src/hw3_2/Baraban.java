package hw3_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Baraban implements Instrument{
    double diameter;


    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " диаметр: " + this.diameter);
    }
}
