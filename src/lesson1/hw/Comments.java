package lesson1.hw;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Comments {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

}
