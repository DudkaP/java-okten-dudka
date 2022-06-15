package hw3_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book implements Printable{
    String name;
    int pages;
    Boolean picture;

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " : " + this.toString());
    }
}
