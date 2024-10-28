package by.tatevik.University_task.model;

import by.tatevik.University_task.service.Actions;
import by.tatevik.University_task.service.StudentActions;

public  class Student implements StudentActions, Actions {
    public String name;
    public int grade;
    public String teacher;

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public void doHW() {
        if(grade>=60&& grade<=100){
            System.out.println("Ответственный студент "+name);
        }else{
            System.out.println("Не ответственный студент "+name+","
                    +teacher+" будет в гневе!");
        }
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
    public void goToUni() {

    }
}
