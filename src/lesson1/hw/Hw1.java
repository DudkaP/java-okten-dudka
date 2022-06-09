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

        User user = new User();
        user.setId(90);
        user.setName("Kolya");
        user.setUsername("Koks");
        user.setEmail("sdf@gd.asd");
        user.setAddress("Object");
        user.setStreet("Street");
        user.setSuite("Suite");
        user.setCity("city");
        user.setZipcode(1380);
        user.setGeo(123);
        user.setLat(321);
        user.setLng(333);
        user.setPhone(730213);
        user.setWebsite("sdfsf.com");
        user.setCompany("Object");
//    private String name = "Name";
        user.setCatchPhrase("Catch");
        user.setBs("Bs");
        System.out.println(user);

    }
}
