package by.tatevik.University_task.model;

import by.tatevik.University_task.service.Actions;
import by.tatevik.University_task.service.StudentActions;
import by.tatevik.University_task.service.TeacherActions;

public class UniversityService {
    public void openUni() {
        System.out.println("Университет начинает работу!");
    }

    public void startUniDay(Student student, Teacher teacher) {
        openUni();
        teacher.goToUni();
        student.doHW();
        teacher.prepareMaterials();
        teacher.toGreet();
        student.toGreet();
        teacher.doLecture();
        teacher.toGrade();
        student.passExam();
        student.visitLibrary();
        student.doVolunteerWork();
        teacher.goToCafe();
        student.goToCafe();
    }
}
