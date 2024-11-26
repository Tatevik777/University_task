package by.tatevik.universitytask.entity;

public class UniversityService {
    public void startDay(TeacherActions teacherActions, StudentActions studentActions) {
        teacherActions.prepareMaterials();
        teacherActions.doLecture();
        teacherActions.toGrade();
        studentActions.doHW();
        studentActions.visitLibrary();
        studentActions.doVolunteerWork();

    }

}
