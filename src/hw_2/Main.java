package hw_2;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;

@Data

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("fife");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelfth");
        words.add("thirteen");
        words.add("fourteen");
        words.add("fifteen");
        words.add("sixteen");
        words.add("seventeen");
        words.add("eighteen");
        words.add("nineteen");
        words.add("twenty");
        System.out.println(words);

        words.sort(Comparator.comparingInt(o -> o.charAt(0)));
        System.out.println(words);

    }
}
