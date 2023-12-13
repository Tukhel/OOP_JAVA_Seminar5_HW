package Seminar_5_HW;

import java.util.ArrayList;
import java.util.List;

import Seminar_5_HW.controller.Controller;
import Seminar_5_HW.model.*;
import Seminar_5_HW.service.StudyGroupService;

public class Main {
    public static void main(String[] args) {
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        Teacher teacher = new Teacher("21", "32", "43", 0);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("abc", "abc", "abc", 0));
        studentList.add(new Student("abc1", "abc1", "abc1", 1));

        StudyGroup studeGroup = controller.createStudyGroup(teacher, studentList);
        System.out.println(studeGroup);
    }
    
}
