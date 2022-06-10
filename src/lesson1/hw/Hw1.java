package lesson1.hw;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println("hw");

        Posts posts = new Posts();
        posts.setUserId(121212);
        posts.setId(22);
        posts.setTitle("Title");
        posts.setBody("sdlfjskl seseli fself sjfskjfjsj sjk skjfjksfjksdfjksdfn sdhsdjf hsdsdjfls d");
        System.out.println(posts);

        Comments comments = new Comments();
        comments.setPostId(454545);
        comments.setId(34);
        comments.setName("Petya");
        comments.setEmail("qwerty@qwe.qw");
        comments.setBody("sdsdfsdfsdfsdff  sd fsdf sdf sdf sssdfgsdf sdfgs gsfgdfgd dgdfsdsd sdfsdsdffsd");
        System.out.println(comments);


    }
}
