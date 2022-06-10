package lesson2.hw3;

public class Komix extends Book{
    private Boolean glyanec;

    @Override
    public String toString() {
        return "Komix{" +
                "glyanec=" + glyanec +
                "} " + super.toString();
    }

    public Boolean getGlyanec() {
        return glyanec;
    }

    public void setGlyanec(Boolean glyanec) {
        this.glyanec = glyanec;
    }

    public Komix(Boolean glyanec) {
        this.glyanec = glyanec;
    }

    public Komix(String name, Boolean glyanec) {
        super(name);
        this.glyanec = glyanec;
    }

    public Komix() {
    }
}