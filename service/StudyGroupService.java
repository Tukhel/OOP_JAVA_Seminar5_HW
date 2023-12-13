package Seminar_5_HW.service;

//import java.util.ArrayList;
import java.util.List;

import Seminar_5_HW.model.*;

public class StudyGroupService {
    // private final List<User> studyGroupList;

    // public StudyGroupService() {
    //     this.studyGroupList = new ArrayList<>();
    // }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}
