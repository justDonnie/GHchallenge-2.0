package service;

import models.Group;
import models.Lesson;

import java.util.List;

public interface LessonInterface {

    void addNewLessonTOGroup(Long idGroup,Long studentId, Long lessonId,String lessonName,String lessonDescription);//12
    void getLessonByName(String groupName, String lessonName);//13
    void getAllLessonByGroupName(String groupName);//14
    void getAllStudentsLesson(String email);//15
    void deleteLesson(Long idGroup, Long lessonId);//16

}
