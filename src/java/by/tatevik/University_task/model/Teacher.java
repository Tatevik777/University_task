package by.tatevik.University_task.model;

import by.tatevik.University_task.service.Actions;
import by.tatevik.University_task.service.TeacherActions;

public class Teacher implements TeacherActions, Actions {
    public String name;
    public Student student;
    public int grade;

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void doLecture() {
        System.out.println("Преподаватель " + name + " в аудитории и читает лекцию");
    }

    @Override
    public void toGrade() {
        if (grade >= 70 && grade <= 100) {
            System.out.println(student.name + " отличный балл");
        }
        if (grade >= 40 && grade < 70) {
            System.out.println(student.name + " бал ниже среднего");
        }
        if (grade < 40) {
            System.out.println(student.name + " На пересдачу");
        }
    }

    @Override
    public void prepareMaterials() {
        System.out.println("Преподаватель " + name + " в аудитории и готовится к лекции для " + student.name);
    }

    @Override
    public void goToUni() {
        System.out.println("Преподаватель " + name + " мчит в университет к любимым студентам ");
    }

    @Override
    public void toGreet() {
        System.out.println("Преподаватель " + name + " приветствует студентов");
    }

    @Override
    public void goToCafe() {
        System.out.println("Преподаватель " + name + " отдыхает в кафе после рабочего дня");
    }
}
