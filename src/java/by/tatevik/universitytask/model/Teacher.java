package by.tatevik.universitytask.model;

import by.tatevik.universitytask.entity.Actions;
import by.tatevik.universitytask.entity.TeacherActions;

public class Teacher implements TeacherActions, Actions {
    private Student student;
    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


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
            System.out.println(student.getName() + " отличный балл");
        }
        if (grade >= 40 && grade < 70) {
            System.out.println(student.getName() + " бал ниже среднего");
        }
        if (grade < 40) {
            System.out.println(student.getName() + " На пересдачу");
        }
    }

    @Override
    public void prepareMaterials() {
        System.out.println("Преподаватель " + name + " в аудитории и готовится к лекции для " + student.getName());
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
