package hw3;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.setPages(350);
        journal.setName("Holliwood");
        journal.setPaper(true);
        System.out.println(journal);

        Komix komix = new Komix();
        komix.setName("Crazy war");
        komix.setPaper(false);
        komix.setGlyanec(true);
        System.out.println(komix);
    }
}
