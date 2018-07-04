package dao;

import bean.Student;

public abstract interface StudentDao
{
  public abstract Student getStudent(int paramInt);
  
  public abstract void addStudent(Student paramStudent);
}


/* Location:           E:\WEB-INF\classes\
 * Qualified Name:     dao.StudentDao
 * JD-Core Version:    0.7.0.1
 */