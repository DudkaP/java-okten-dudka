package hw3_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Truba implements Instrument {

    int length;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " длина: " + this.length);
    }
}
