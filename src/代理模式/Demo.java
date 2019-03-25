package 代理模式;


//静态代理模式
public class Demo implements Person{
	
	private Person p;
	
	public Demo(Person p){
		this.p = p;
	}

	@Override
	public void sayHi(String msg) {
		// TODO Auto-generated method stub
		System.out.println("前置");
		p.sayHi(msg);
		System.out.println("后置");
	}

	@Override
	public void goodBye(String msg) {
		// TODO Auto-generated method stub
		System.out.println("前置");
		p.goodBye(msg);
		System.out.println("后置");
	}
	
}
