package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
	private String a_name;
	private String author;
	private String age;

	public String getA_name() {
		return this.a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
