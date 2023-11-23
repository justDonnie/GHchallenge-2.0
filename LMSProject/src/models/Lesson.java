package models;

public class Lesson {

    private Long id;
    private String lessons;
    private String description;
    private static Long idCounter = 0L;

    public Lesson(String lessons, String description) {
        this.id = generateUniqueId();
        this.lessons = lessons;
        this.description = description;
    }
    private synchronized Long generateUniqueId(){
        idCounter++;
        return idCounter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n Lesson- " +
                "\nid: " + id +
                "\n lessons: " + lessons +
                "\n description: " + description ;
    }
}
