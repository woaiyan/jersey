package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Blog {
	private int id;
	private String name;
	private Article article;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}

/*
 * Location: E:\WEB-INF\classes\
 * 
 * Qualified Name: bean.Blog
 * 
 * JD-Core Version: 0.7.0.1
 * 
 */