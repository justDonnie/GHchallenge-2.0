package models;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private Long id;
    private String name;
    private String description;
    private List<Student> students;
    private List<Lesson>lessons;
    private static Long idCounter = 0L;

    public Group(String name, String description, List<Student> students, List<Lesson> lessons) {
        this.id = generateUniqueId();
        this.name = name;
        this.description = description;
        this.students = students;
        this.lessons = lessons;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
    public  void  setLesson(Lesson lesson){
        if (this.lessons==null){
            this.lessons=new ArrayList<>();
       }
        lessons.add(lesson);
    }

    @Override
    public String toString() {
        return "\n \n Group-" +
                "\nid: " + id +
                "\n name: " + name +
                "\n description: " + description +
                "\n students: " + students +
                "\n lessons: " + lessons ;



    }
}
