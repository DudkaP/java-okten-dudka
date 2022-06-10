package lesson2.hw1;

import lesson2.hw1.user.Adress;
import lesson2.hw1.user.Company;
import lesson2.hw1.user.Geo;
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
    private Adress adress;
    private int phone;
    private String website;
    private Company company;

}
