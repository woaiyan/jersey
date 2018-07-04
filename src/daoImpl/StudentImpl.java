package daoImpl;

import bean.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class StudentImpl extends SqlSessionDaoSupport implements StudentDao {
	public SqlSessionTemplate sqlSessionTemplate;

	public Student getStudent(int id) {
		Student s = new Student();
		s.setId(id);
		Student s1 = (Student) getSqlSession().selectOne("com.forum.dao.UserMapper.getStudent", s);
		return s1;
	}

	public void addStudent(Student s) {
		getSqlSession().insert("com.forum.dao.UserMapper.insert", s);
	}
}
