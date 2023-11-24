public class Newspaper extends News{

    public Newspaper(String name, int pages) {
        super(name, pages);
    }

    public Newspaper() {
    }

    @Override
    public void read() {
        System.out.println(" My grandmother always read SuperInfo");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
