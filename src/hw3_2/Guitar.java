package hw3_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Guitar implements Instrument{
    int struni;
    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " колличество струн:  " + this.struni);
    }
}
