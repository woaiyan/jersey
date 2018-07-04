/*  1:   */ package rest;

/*  2:   */
import bean.Blog;
import com.sun.jersey.api.spring.Autowire;
import java.io.PrintStream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import serviceImpl.BlogSImpl;

@Autowire
@Path("test0")
public class Test {
	private BlogSImpl s;

	public BlogSImpl getS() {
		return this.s;
	}

	public void setS(BlogSImpl s) {
		this.s = s;
	}

	@GET
	@Path("test1")
	@Produces({ "application/json" })
	@tests
	public Blog getUserText() {
		Blog ss = this.s.getBlog(5);
		System.out.println(ss.getName());
		return ss;
	}
}
