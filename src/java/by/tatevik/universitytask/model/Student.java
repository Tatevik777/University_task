package by.tatevik.universitytask.model;

import by.tatevik.universitytask.entity.Actions;
import by.tatevik.universitytask.entity.StudentActions;

public class Student implements StudentActions, Actions {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private Teacher teacher;

    public int getGrade() {
        return grade;
    }

    private int grade;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void doHW() {
        if (grade >= 60 && grade <= 100) {
            System.out.println("Ответственный студент " + name);
        } else {
            System.out.println("Не ответственный студент " + name);
        }
    }

    @Override
    public void passExam() {
        if (grade >= 70 && grade <= 100) {
            System.out.println("Экзамен успешно сдал" + name);
            if (grade >= 50 && grade < 70) {
                System.out.println("Экзамен сдал, но в следующий раз надо лучше подготовится" + name);
            }
        } else {
            System.out.println("Надо договорится с преподавателем " + teacher.getName() + " о пересдаче " + name);
        }
    }

    @Override
    public void doVolunteerWork() {
        System.out.println("Отправлен на волонтерскую работу " + name);
    }

    @Override
    public void visitLibrary() {
        System.out.println("Делает конспект в библиотеке " + name);
    }

    @Override
    public void goToUni() {
        System.out.println("Мчит в универ самый ответственный студент " + name);
    }

    @Override
    public void toGreet() {
        System.out.println(name + " Приветствует учителя");
    }

    @Override
    public void goToCafe() {
        System.out.println(name + " Слишком устал от учебы и пьет какао");
    }
}
