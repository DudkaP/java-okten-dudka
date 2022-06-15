package hw3_1;

import java.util.ArrayList;

public class Magazine implements Printable{

    @Override
    public void print(ArrayList<String> prints) {
        for (int i = prints.size()-1; i >= 0; i--) {
            System.out.println(prints.get(i));
        }
    }
}
