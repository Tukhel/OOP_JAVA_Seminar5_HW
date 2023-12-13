package Seminar_5_HW.controller;

import Seminar_5_HW.model.*;
import Seminar_5_HW.service.*;
import Seminar_5_HW.view.StudentView;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public StudyGroup createStudyGroup(Teacher teaher, List<Student> listStudent) {
        return studyGroupService.createStudyGroup(teaher, listStudent);
    }

    public void getAllStudent() {
        for (User user : dataService.getAllConcUser(Type.STUDENT)) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void getStudyGroup() {

    }
}
