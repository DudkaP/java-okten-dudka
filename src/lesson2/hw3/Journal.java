package lesson2.hw3;

public class Journal extends Book{
    private int pages;

    public Journal() {
    }

    public Journal(int pages) {
        this.pages = pages;
    }

    public Journal(String name, int pages) {
        super(name);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "pages=" + pages +
                "} " + super.toString();
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
