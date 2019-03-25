package 代理模式;

public class Student implements Person{

	@Override
	public void sayHi(String msg) {
		// TODO Auto-generated method stub
		System.out.println("sayHi"+msg);
	}

	@Override
	public void goodBye(String msg) {
		// TODO Auto-generated method stub
		System.out.println("goodBye"+msg);
		
	}

	
}
