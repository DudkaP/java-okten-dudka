package lesson2.hw1.user;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Adress {
    private String street = "Street";
    private String suite;
    private String city;
    private int zipcode;
    private Geo geo;
}
