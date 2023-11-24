public class Magazine extends News{
    public Magazine(String name, int pages) {
        super(name, pages);
    }

    public Magazine() {
    }

    @Override
    public void read() {
        System.out.println(" Magazine the One always prints the famous actors");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
