package serviceImpl;

import bean.Blog;
import daoImpl.BlogImpl;
import service.BlogService;

public class BlogSImpl implements BlogService {
	private BlogImpl blogImpl;

	public BlogImpl getBlogImpl() {
		return this.blogImpl;
	}

	public void setBlogImpl(BlogImpl blogImpl) {
		this.blogImpl = blogImpl;
	}

	public Blog getBlog(int id) {
		return this.blogImpl.getBlog(id);
	}
}
