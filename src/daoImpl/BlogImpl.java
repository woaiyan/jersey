package daoImpl;

import bean.Blog;
import dao.BlogDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BlogImpl extends SqlSessionDaoSupport implements BlogDao {
	public SqlSessionTemplate sqlSessionTemplate;

	public Blog getBlog(int id) {
		Blog blog = new Blog();
		blog.setId(id);
		return (Blog) getSqlSession().selectOne("com.Blog.getBlog", blog);
	}
}
