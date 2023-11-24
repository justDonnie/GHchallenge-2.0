public class Gadget extends News{
    public Gadget(String name, int pages) {
        super(name, pages);
    }

    public Gadget() {
    }

    @Override
    public void read() {
        System.out.println(" I always read news on textbook");
    }

    @Override
    public String toString() {
        return "Gadget- " + super.toString();
    }
}
