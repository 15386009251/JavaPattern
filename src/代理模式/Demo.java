package ����ģʽ;


//��̬����ģʽ
public class Demo implements Person{
	
	private Person p;
	
	public Demo(Person p){
		this.p = p;
	}

	@Override
	public void sayHi(String msg) {
		// TODO Auto-generated method stub
		System.out.println("ǰ��");
		p.sayHi(msg);
		System.out.println("����");
	}

	@Override
	public void goodBye(String msg) {
		// TODO Auto-generated method stub
		System.out.println("ǰ��");
		p.goodBye(msg);
		System.out.println("����");
	}
	
}
