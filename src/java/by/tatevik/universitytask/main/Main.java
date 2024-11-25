package by.tatevik.universitytask.main;

import by.tatevik.universitytask.model.Student;
import by.tatevik.universitytask.model.Teacher;
import by.tatevik.universitytask.entity.UniversityService;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        student.setTeacher(teacher);
        teacher.setStudent(student);
        teacher.setName("Галина Александровна");
        student.setName("Скрудж Макдак");
        student.setGrade(30);
        teacher.setGrade(student.getGrade());

        teacher.goToUni();
        student.goToUni();

        UniversityService universityService = new UniversityService();
        universityService.startDay(teacher,student);
    }
}