import database.Database;
import enumClass.Gender;
import models.Admin;
import models.Group;
import models.Lesson;
import models.Student;
import service.GroupService;
import service.LessonService;
import service.StudentService;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Group> groups = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Lesson>lessons = new ArrayList<>();
        Admin admin = new Admin(4747L, "Admin", "Adminov", "admin@gmail.com", "123admin", "Male");
        Database dataBase = new Database(students, groups, lessons);
        GroupService groupService = new GroupService(dataBase);
        StudentService studentService = new StudentService(dataBase);
        LessonService lessonService = new LessonService(dataBase, groupService);


        int time1 = ZonedDateTime.now().getHour();
        if (time1 >= 6 && 12 >= time1) {
            System.out.println("Good morning !!! " + ZonedDateTime.now().getHour() + ":" + ZonedDateTime.now().getMinute() + " A.M");
        } else if (time1 >= 13 && 18 >= time1) {
            System.out.println("Good afternoon !!! " + ZonedDateTime.now().getHour() + ":" + ZonedDateTime.now().getMinute() + " P.M");
        } else if (time1 >= 19 && 22 >= time1) {
            System.out.println("Good evening !!! " + ZonedDateTime.now().getHour() + ":" + ZonedDateTime.now().getMinute() + " P.M");
        } else {
            System.out.println("Good night !!! " + ZonedDateTime.now().getHour() + ":" + ZonedDateTime.now().getMinute() + " A.M");
        }

        int f = 0;
        while (f < 22) {
            System.out.println("1 -> Add group to the system                 "+" \t ８  －> Get students ifo by name  ");
            System.out.println("2 -> Get group by name                       "+" \t ９  －> Get students info by group name ");
            System.out.println("３－> Update group                            "+" \t １０ －> Delete student by ID     ");
            System.out.println("４－> Get all list of groups                  "+" \t １１ －> Add new lesson to group  ");
            System.out.println("５－> Delete group by ID                      "+" \t １２ －> Get lesson by name ");
            System.out.println("６－> Add students to groups                  "+" \t １３ －> Get all lesson of group by group name");
            System.out.println("７－> Update students info                    "+" \t １４ －> Get all lessons of students");
            System.out.println("１５ －> Delete lesson");
            try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Create a group!: ");
                    String createGroup = scanner1.nextLine();
                    System.out.print("Input description of group!: ");
                    String description = scanner1.nextLine();
                    groupService.saveGroup(createGroup, description, students, lessons);
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Write a group name to find!: ");
                    String findGroupByName = scanner2.nextLine();
                    System.out.println(groupService.getGroupByName(findGroupByName));
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Write a group name to update!: ");
                    String oldName = scanner3.nextLine();
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.print("Write a new group name to update!: ");
                    String newName = scanner4.nextLine();
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.print("Write a description of group!: ");
                    String desc = scanner5.nextLine();
                    System.out.println(groupService.updateGroup(oldName, newName, desc));
                    break;
                case 4:
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.print("Full list of groups: ");
                    System.out.println(groupService.getAllGroups());
                    break;
                case 5:
                    System.out.print("Enter a groups ID to delete!: ");
                    Long groupID = scanner.nextLong();
                    groupService.deleteGroup(groupID);
                    break;
                case 6:
                    System.out.print("Write a group name to add student!: ");
                    String groupName = new Scanner(System.in).nextLine();
                    Scanner scanner8 = new Scanner(System.in);
                    System.out.print("\n Add new student!" +
                            "\nWrite a first name!:  ");
                    String firstName = scanner8.nextLine();
                    System.out.print("Write a last name!: ");
                    String lastName = new Scanner(System.in).nextLine();
                    System.out.print("Input age of student!: ");
                    Integer age = scanner8.nextInt();
                    System.out.print("Input a gmail of student!: ");
                    String gmail = new Scanner(System.in).nextLine();
                    System.out.print("Input a password!: ");
                    String password = new Scanner(System.in).nextLine();
                    System.out.print("Input a gender of student!: ");
                    String genderIn = new Scanner(System.in).nextLine();
                    if (genderIn.equalsIgnoreCase("male")) {
                        genderIn = String.valueOf(Gender.MALE);
                    } else if (genderIn.equalsIgnoreCase("female")) {
                        genderIn = String.valueOf(Gender.FEMALE);
                    } else {
                        System.out.println(Gender.UNKNOWN + " gender specified!!!");
                    }
                    studentService.saveStudentToGroup(groupName, firstName, lastName, age, gmail, password, Gender.valueOf(genderIn));
                    break;
                case 7:
                    System.out.print("Input the student's ID to update!: ");
                    Long ID = new Scanner(System.in).nextLong();
                    System.out.print("Enter a new first name!: ");
                    String new1stName = new Scanner(System.in).nextLine();
                    System.out.print("Enter a new last name!: ");
                    String new2LastName = new Scanner(System.in).nextLine();
                    System.out.print("Input a new age of student!: ");
                    Integer newAge = new Scanner(System.in).nextInt();
                    System.out.print("Input a new gmail of student!: ");
                    String newGmail = new Scanner(System.in).nextLine();
                    System.out.print("Enter a new password of student!: ");
                    String newPassword = new Scanner(System.in).nextLine();
                    System.out.print("Input a new gender of student!: ");
                    String newGender = new Scanner(System.in).nextLine();
                    if (newGender.equalsIgnoreCase("male")) {
                        newGender = String.valueOf(Gender.MALE);
                    } else if (newGender.equalsIgnoreCase("female")) {
                        newGender = String.valueOf(Gender.FEMALE);
                    } else {
                        System.out.println(Gender.UNKNOWN + " gender specified!!!");
                    }
                    System.out.println(studentService.updateStudent(ID, new1stName, new2LastName, newAge, newGmail, newPassword, Gender.valueOf(newGender)));
                    break;
                case 8:
                    System.out.print("Enter a student's name to find by name!: ");
                    String studentsName = new Scanner(System.in).nextLine();
                    System.out.println(studentService.findStudentByName(studentsName));
                    break;
                case 9:
                    System.out.print("Enter a group name to get full list of students!: ");
                    String group_Name = new Scanner(System.in).nextLine();
                    System.out.println(studentService.getAllStudentsByGroupName(group_Name));
                    break;
                case 10:
                    System.out.print("Enter a group ID to find student and delete!: ");
                    Long groupId = new Scanner(System.in).nextLong();
                    System.out.print("Input student's ID to delete this student!: ");
                    Long studentId = new Scanner(System.in).nextLong();
                    studentService.deleteStudent(groupId, studentId);
                    break;
                case 11:
                    System.out.print("Find a group by ID to add the lesson!: ");
                    Long idGroup = new Scanner(System.in).nextLong();
                    System.out.print("Enter a students ID to add the lesson");
                    Long idStudent = new Scanner(System.in).nextLong();
                    System.out.print("Assign an ID to the lesson!: ");
                    Long lessonId = new Scanner(System.in).nextLong();
                    System.out.print("Input a lesson name!: ");
                    String lessonName = new Scanner(System.in).nextLine();
                    System.out.print("Enter a description of lesson!: ");
                    String lessonDescription = new Scanner(System.in).nextLine();
                    lessonService.addNewLessonTOGroup(idGroup, idStudent, lessonId, lessonName, lessonDescription);
                    break;
                case 12:
                    System.out.print("Input the group name to find the lesson!: ");
                    String groupNamee = new Scanner(System.in).nextLine();
                    System.out.print("Enter the lesson name to find!: ");
                    String nameLesson = new Scanner(System.in).nextLine();
                    lessonService.getLessonByName(groupNamee, nameLesson);
                    break;
                case 13:
                    System.out.print("Input the group name to get all lessons of this group!: ");
                    String group__Name = new Scanner(System.in).nextLine();
                    lessonService.getAllLessonByGroupName(group__Name);
                    break;
                case 14:
                    System.out.print("Write a students email to get lessons of this student!: ");
                    String email = new Scanner(System.in).nextLine();
                    lessonService.getAllStudentsLesson(email);
                    break;
                case 15:
                    System.out.print("Input group ID to delete the lesson!: ");
                    Long idGroupp = new Scanner(System.in).nextLong();
                    System.out.print("Input the lessons ID to delete this lesson!: ");
                    Long idLesson = new Scanner(System.in).nextLong();
                    lessonService.deleteLesson(idGroupp, idLesson);
                    break;
                default:
                    System.out.println(" Choose only this commands!!!");
                    break;

            }

        }catch (InputMismatchException e){
                System.out.println("Input a correct commands!!!");
            }
        }
        }

    }