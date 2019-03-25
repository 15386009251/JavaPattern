package 代理模式;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		PersonHandler handler = new PersonHandler(t);
		Person proxy = (Person) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), handler);
		proxy.sayHi("sssssssssssssss");
		System.out.println("end");
	}
}
