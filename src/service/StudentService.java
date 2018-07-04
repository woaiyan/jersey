package service;

import bean.Student;

public abstract interface StudentService
{
  public abstract Student getStudent(int paramInt);
  
  public abstract void addStudent(Student paramStudent);
}


