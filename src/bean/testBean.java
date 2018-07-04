package bean;

import java.io.PrintStream;
import org.springframework.stereotype.Component;
import rest.tests;

@Component
public class testBean {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@tests
	public void showName(String name) {
		System.out.println(name);
	}
}
