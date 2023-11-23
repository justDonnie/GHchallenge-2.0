package service;

import enumClass.Gender;
import models.Group;
import models.Lesson;
import models.Student;

import java.util.List;

public interface GroupInterface {

    void saveGroup(String name, String description, List<Student> students, List<Lesson>lessons);//1
    Group getGroupByName(String name);//2
    Group updateGroup(String oldName,String newName,String description);//3
    List<Group> getAllGroups();//4
    void deleteGroup(Long id);//5
}
