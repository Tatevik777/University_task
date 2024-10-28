package by.tatevik.University_task.main;

import by.tatevik.University_task.model.Student;
import by.tatevik.University_task.model.Teacher;
import by.tatevik.University_task.model.University;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        University university=new University();


        Teacher teacher=new Teacher();
        teacher.name="Лариса Ивановна";
        teacher.student="Галя";
        teacher.goToUni();
        teacher.prepareMaterials();
        teacher.doLecture();
        teacher.toGrade(40);

        Student student=new Student();
        student.name="Наташа";
        student.teacher="Галина Ивановна";
        student.setGrade(30);
        student.doHW();

        Student student2=new Student();
        student2.name="Полина";
        student2.teacher="Таисия Афанасьевна";
        student2.setGrade(70);
        student2.doHW();









    }
}
