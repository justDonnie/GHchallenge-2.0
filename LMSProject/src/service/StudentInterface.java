package service;

import enumClass.Gender;
import models.Student;

public interface StudentInterface {

    void saveStudentToGroup(String groupName, String name, String lastName, Integer age, String email, String password, Gender gender);//6
    String updateStudent(Long id, String new1stName, String new2LastName, Integer newAge, String newEmail, String newPassword, Gender newGender);//7
    Student findStudentByName(String name);//8
    Student getAllStudentsByGroupName(String groupName);//9
    void deleteStudent(Long groupId, Long studentId);//11
}
