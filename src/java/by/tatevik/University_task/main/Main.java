package by.tatevik.University_task.main;

import by.tatevik.University_task.model.Student;
import by.tatevik.University_task.model.Teacher;
import by.tatevik.University_task.model.University;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.openUni();

        Teacher teacher = new Teacher();
        teacher.name = "Лариса Ивановна";
        teacher.goToUni();
        teacher.prepareMaterials();
        teacher.doLecture();
        teacher.toGreet();
        teacher.goToCafe();

        Student student = new Student();
        student.setName("Дональд Дак");
        student.goToUni();
        student.toGreet();
        student.doHW();
        student.grade=30;
        student.toGrade(40, student.getName());
        student.passExam();
        student.doVolunteerWork();
        student.visitLibrary();
        student.goToCafe();

        Student student2 = new Student();
        student2.setName("Микки Маус");
        student2.grade=90;
        student2.toGrade(90,student2.getName());
    }
}
