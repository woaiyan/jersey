package test;

import java.io.PrintStream;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class testAop1 {
	@Pointcut("execution(public * bean.*.*(..))")
	public void matchs() {
	}

	@Before("matchs() && args(name)")
	public void before(String name) {
		System.out.println("before:" + name);
	}
}
