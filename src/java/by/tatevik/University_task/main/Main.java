package by.tatevik.University_task.main;

import by.tatevik.University_task.model.Student;
import by.tatevik.University_task.model.Teacher;
import by.tatevik.University_task.model.University;
import by.tatevik.University_task.service.TeacherActions;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.openUni();


        Teacher teacher1 = new Teacher();
        Student student1 = new Student();
        student1.setTeacher("Галина Владимировна");
        teacher1.setStudent("Маша");
        student1.name= teacher1.student;
        teacher1.name=student1.teacher;


        student1.toGreet();
        teacher1.doLecture();

    }}