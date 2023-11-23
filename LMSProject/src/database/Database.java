package database;

import models.Group;
import models.Lesson;
import models.Student;

import java.util.ArrayList;
import java.util.List;

public class Database {
        private List<Student> students;
        private List<Group>groups;
        private List<Lesson>lessons ;

    public Database(List<Student> students, List<Group> groups, List<Lesson> lessons) {
        this.students = students;
        this.groups = groups;
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
            return students;
        }

        public void setStudents(List<Student> students) {
            this.students = students;
        }

        public List<Group> getGroups() {
            return groups;
        }

        public void setGroups(List<Group> groups) {
            this.groups = groups;
        }

        public List<Lesson> getLessons() {
            return lessons;
        }

        public void setLessons(List<Lesson> lessons) {
            this.lessons = lessons;
        }
    }

