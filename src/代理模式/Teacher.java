package 代理模式;

public class Teacher implements Person {

	@Override
	public void sayHi(String msg) {
		// TODO Auto-generated method stub
		System.out.println("T sayHi " + msg);
	}

	@Override
	public void goodBye(String msg) {
		// TODO Auto-generated method stub
		System.out.println("T goodBye " + msg);
		
	}

}
