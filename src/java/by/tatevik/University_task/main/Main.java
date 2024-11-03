package by.tatevik.University_task.main;

import by.tatevik.University_task.model.Student;
import by.tatevik.University_task.model.Teacher;
import by.tatevik.University_task.model.UniversityService;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        student.setTeacher(teacher);
        teacher.setStudent(student);

        teacher.name = "Галина Александровна";
        student.name = "Скрудж Макдак";
        student.setGrade(20);
        student.grade = teacher.grade;

        UniversityService universityService = new UniversityService();
        universityService.startUniDay(student, teacher);
    }
}