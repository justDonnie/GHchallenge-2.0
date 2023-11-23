package service;

import database.Database;
import enumClass.Gender;
import exception.MyException;
import models.Group;
import models.Lesson;
import models.Student;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LessonService implements LessonInterface{
    private Database database;
    private GroupService groupService;

    public LessonService(Database database, GroupService groupService) {
        this.database = database;
        this.groupService = groupService;
    }


    @Override
    public void addNewLessonTOGroup(Long idGroup,Long studentId, Long lessonId,String lessonName,String lessonDescription) {
        try{
        for (Group f:groupService.getAllGroups()) {
            for (int i = 0; i < f.getStudents().size(); i++) {
                if (idGroup.equals(f.getId())){
                    if (f.getStudents().get(i).getId().equals(studentId)){
                        f.getLessons().add(new Lesson(lessonName,lessonDescription));
                        System.out.println("The lesson is successfully added!");
                        return;
                    }
                }
                throw new MyException(" There is no any group with this ID!");
            }
        }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getLessonByName(String groupName,String lessonName) {
        try{
        for (Group group : database.getGroups()) {
            if (group.getName().equalsIgnoreCase(groupName)) {
                for (Lesson lesson : group.getLessons()) {
                    if (lesson.getLessons().equalsIgnoreCase(lessonName)) {
                        System.out.println(lesson);
                        return;
                    }
                    throw new MyException("There is no any lessons with this name!!!");
                }
            }throw new MyException(" There is no any groups with this name!!!");

        }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }



    @Override
    public void getAllLessonByGroupName( String groupName) {
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.println("Enter name group");
                String name = new Scanner(System.in).nextLine();
                boolean isFalse = false;
                for (Group g : database.getGroups()) {
                    if (g.getName().equalsIgnoreCase(name)) {
                        System.out.println(g.getLessons());
                        isTrue = false;
                        break;
                    } else {
                        isFalse = true;
                    }
                }
                if (isFalse) {
                    throw new MyException("Group not found");
                }
            } catch (MyException e) {
                System.err.println(e.getMessage());
            }
        }
    }
//        try{
//        for (Group d: database.getGroups()) {
//            if (d.getName().equalsIgnoreCase(groupName)){
//                System.out.println(d.getLessons());
//                return;
//            }
//        }throw new MyException("There is no any group with this name!!!");
//
//        }catch (MyException r){
//            System.out.println(r.getMessage());
//        }catch (InputMismatchException a){
//            System.out.println("Input correct group name!!!");
//        }
//    }

    @Override
    public void getAllStudentsLesson(String email) {
        try{
        for (Group d: database.getGroups()) {
            for (Student s:d.getStudents()) {
                if (s.getEmail().equals(email)){
                    System.out.println(d.getLessons());
                } else if (!email.contains("@gmail.com")) {

                }
            }throw new MyException("Gmail should contain @ !!!");
        }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteLesson(Long idGroup, Long lessonId) {
        try{
        for (Group d: database.getGroups()) {
            if (d.getId().equals(idGroup)){
                for (Lesson a:d.getLessons()) {
                    if (a.getId().equals(lessonId)){
                        d.getLessons().remove(a);
                        System.out.println("Lesson is successfully deleted!!!");
                    }
                    throw new MyException("There is no any lesson with this ID");
                }
            }throw new MyException("There is no any groups with this ID!!!");
        }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

}
