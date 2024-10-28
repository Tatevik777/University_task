package by.tatevik.University_task.model;

import by.tatevik.University_task.service.Actions;
import by.tatevik.University_task.service.TeacherActions;

public class Teacher extends Student implements TeacherActions, Actions {
    public String student;
    public String name;

    @Override
    public void doLecture() {
        System.out.println("Преподаватель " + name +" в аудитории и читает лекцию для "+student);
    }
    @Override
    public void toGrade(int grade) {
        if(grade>=70&& grade<=100){
            System.out.println(student+" бал выше среднего");
        }if(grade>=40){
            System.out.println(student +" бал ниже среднего");
        }else {
            System.out.println(student + " На пересдачу");
        }
    }
    @Override
    public void prepareMaterials() {
        System.out.println("Преподаватель " + name +" в аудитории и готовится к лекции для " + student);
    }
    @Override
    public void goToUni() {
        System.out.println("Преподаватель " + name +" мчит в университет к любимым студентам " );
    }
}
