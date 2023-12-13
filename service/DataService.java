package Seminar_5_HW.service;

import java.util.ArrayList;
import java.util.List;

import Seminar_5_HW.model.*;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String LastName, Type type) {
        int id = getMaxId(type);
        if (type == Type.STUDENT){
            userList.add(new Student(firstName, secondName, LastName, id));
        }
        if (type == Type.TEACHER){
            userList.add(new Teacher(firstName, secondName, LastName, id));
        }
        
    }

    private int getMaxId(Type type) {
        boolean itsStudent = type == Type.STUDENT;
        int maxId = 0;

        for (User user : userList) {
            if (user instanceof Student && itsStudent) {
                maxId = ((Student) user).getStudentId() + 1;
            }
            if (user instanceof Teacher && !itsStudent) {
                maxId = ((Teacher) user).getTeaherId() + 1;
            }
        }
        return maxId;
    }

    public List<User> getAllConcUser(Type type){
        List<User> resultList = new ArrayList<>();
        boolean itsStudent = type == Type.STUDENT;

        for (User user : userList) {
            if(user instanceof Student && itsStudent){
                resultList.add(user);
            }
            if (user instanceof Teacher && !itsStudent) {
                resultList.add(user);
            }
        }

        return resultList;
    }
}