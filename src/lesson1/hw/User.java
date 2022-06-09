package lesson1.hw;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Object address;
    private String street;
    private String suite;
    private String city;
    private int zipcode;
    private Object geo;
    private int lat;
    private int lng;
    private int phone;
    private String website;
    private Object company;
//    private String name = "Name";
    private String catchPhrase;
    private String bs;
}
