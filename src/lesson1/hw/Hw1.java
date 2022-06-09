package lesson1.hw;

public class Hw1 {
    public static void main (String[] args){
        System.out.println("hw");

        User user = new User();
        user.setUserId(121212);
        user.setId(22);
        user.setTitle("Title");
        user.setBody("sdlfjskl seseli fself sjfskjfjsj sjk skjfjksfjksdfjksdfn sdhsdjf hsdsdjfls d");
        System.out.println(user);

        Comments comments = new Comments();
        System.out.println(comments);

    }
}
