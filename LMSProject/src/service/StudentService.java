package service;

import database.Database;
import enumClass.Gender;
import models.Group;
import models.Student;

import java.util.List;
import java.util.Random;

public class StudentService implements StudentInterface{
    private Database database;

    public StudentService(Database database) {
        this.database = database;
    }

    @Override
    public void saveStudentToGroup(String groupName, String name, String lastName, Integer age, String email, String password, Gender gender) {
        Random random = new Random();
        Long id = random.nextLong(1, 50);
        for (int i = 0; i < database.getGroups().size(); i++) {
            if (database.getGroups().get(i).getName().equalsIgnoreCase(groupName)) {
                database.getGroups().get(i).getStudents().add(new Student(name, lastName, age, email, password, gender));
                System.out.println("Student successfully saved to group!!! ");
            }
        }
    }

    @Override
    public String updateStudent(Long id, String new1stName, String new2LastName, Integer newAge, String newEmail, String newPassword, Gender newGender) {
        for (Group f : database.getGroups()) {
            for (int i = 0; i < f.getStudents().size(); i++) {
                if (f.getStudents().get(i).getId().equals(id)) {
                    f.getStudents().get(i).setName(new1stName);
                    f.getStudents().get(i).setLastName(new2LastName);
                    f.getStudents().get(i).setAge(newAge);
                    f.getStudents().get(i).setEmail(newEmail);
                    f.getStudents().get(i).setPassword(newPassword);
                    f.getStudents().get(i).setGender(newGender);
                    return f.getStudents().get(i)+" Student is successfully updated!";
                }
            }
        }


        return null;
    }

    @Override
    public Student findStudentByName(String name) {
        for (Group k : database.getGroups()) {
            for (int i = 0; i < k.getStudents().size(); i++) {
                if (k.getStudents().get(i).getName().equalsIgnoreCase(name)) {
                    return k.getStudents().get(i);
                }
            }
        }
        return null;
    }

    @Override
    public Student getAllStudentsByGroupName(String groupName) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().equalsIgnoreCase(groupName)){
                System.out.println(database.getGroups().get(i).getStudents());
        }
                } return null;
            }





    @Override
    public void deleteStudent(Long groupId, Long studentId) {
        for (Group d : database.getGroups()) {
            for (int i = 0; i < database.getStudents().size(); i++) {
                if (groupId.equals(d.getId())){
                    if (d.getStudents().get(i).getId().equals(studentId)){
                        d.getStudents().remove(d.getStudents().get(i));
                        System.out.println("Student is successfully deleted!!!");
                    }
            }
            }
        }
    }
}
