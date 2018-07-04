package serviceImpl;

import bean.Student;
import daoImpl.StudentImpl;
import service.StudentService;

public class StudentSImpl implements StudentService {
	private StudentImpl StudentImpl;

	public Student getStudent(int id) {
		return this.StudentImpl.getStudent(id);
	}

	public StudentImpl getStudentImpl() {
		return this.StudentImpl;
	}

	public void setStudentImpl(StudentImpl studentImpl) {
		this.StudentImpl = studentImpl;
	}

	public void addStudent(Student s) {
		this.StudentImpl.addStudent(s);
	}
}
