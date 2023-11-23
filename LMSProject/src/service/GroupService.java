package service;

import database.Database;
import exception.MyException;
import models.Group;
import models.Lesson;
import models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupService implements GroupInterface{

    private Database database;

    public GroupService(Database database) {
        this.database = database;
    }
    @Override
    public void saveGroup(String name, String description, List<Student> students, List<Lesson> lessons) {
        Random random = new Random();
        Long id = random.nextLong(1, 100);
        database.getGroups().add(new Group(name, description, students, lessons));
        System.out.println("Group is successfully saved!");
    }

    @Override
    public Group getGroupByName(String name) {
        for (Group g : database.getGroups()) {
            if (g.getName().equalsIgnoreCase(name)) {
                return g;
            }
        }
        return null;
    }

    @Override
    public Group updateGroup(String oldName, String newName, String description) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if (database.getGroups().get(i).getName().equals(oldName)) {
                database.getGroups().get(i).setName(newName);
                database.getGroups().get(i).setDescription(description);
                return database.getGroups().get(i);
            }
        }
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        return database.getGroups();
    }

    @Override
    public void deleteGroup(Long id) {
        List<Group>groups = database.getGroups();
        try {
            for (Group g :groups) {
                if (id.equals(g.getId())) {
                    database.getGroups().remove(g);
                    System.out.println("Group is successfully deleted!!!");
                    return;
                } else {
                    throw new MyException("There is no any group with this ID!!! ");
                }
            }
        }
        catch (MyException e){
            System.out.println("Try again!!!");
        }
    }
}
