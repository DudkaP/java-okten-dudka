package hw3_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine implements Printable{
    String genre;
    int age;

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " : " + this.toString());
    }
}
