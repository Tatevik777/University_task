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