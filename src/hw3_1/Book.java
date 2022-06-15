package hw3_1;

import java.util.ArrayList;

public class Book implements Printable{
    @Override
    public void print(ArrayList<String> prints) {
        for (String print : prints){
            System.out.println(print);
        }
    }

}
