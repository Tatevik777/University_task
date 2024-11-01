package by.tatevik.University_task.model;

import by.tatevik.University_task.service.Actions;
import by.tatevik.University_task.service.StudentActions;
import by.tatevik.University_task.service.TeacherActions;

public class University implements Actions, StudentActions, TeacherActions {
 public void openUni(){
     System.out.println("Университет начинает работу!");
 }


    @Override
    public void goToUni() {

    }

    @Override
    public void toGreet() {

    }

    @Override
    public void goToCafe() {

    }

    @Override
    public void doHW() {

    }

    @Override
    public void passExam() {

    }

    @Override
    public void doVolunteerWork() {

    }

    @Override
    public void visitLibrary() {

    }

    @Override
    public void doLecture() {

    }

    @Override
    public void toGrade(int grade, String student) {

    }

    @Override
    public void prepareMaterials() {

    }
}
