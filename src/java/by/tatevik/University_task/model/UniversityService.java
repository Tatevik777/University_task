package by.tatevik.University_task.model;

import by.tatevik.University_task.service.Actions;
import by.tatevik.University_task.service.StudentActions;
import by.tatevik.University_task.service.TeacherActions;

import javax.swing.*;

public class UniversityService {
  public void startDay(TeacherActions teacherActions, StudentActions studentActions){
      teacherActions.prepareMaterials();
      teacherActions.doLecture();
      teacherActions.toGrade();
      studentActions.doHW();
      studentActions.visitLibrary();
      studentActions.doVolunteerWork();

  }

}
