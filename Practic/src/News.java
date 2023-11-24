public abstract class News implements Readable {
    private  String name;
    private int pages;

    public News(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    public News(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "News " +
                "name: " + name + '\'' +
                "pages: " + pages;
    }
}
