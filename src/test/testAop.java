package test;

import java.io.PrintStream;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class testAop {
	@Pointcut("args(String,..) && within(bean.*)")
	public void shows() {
	}

	@Before("shows()")
	public void showss() {
		System.out.println("before");
	}

	@After("shows()")
	public void showsssln() {
		System.out.print("after");
	}
}
