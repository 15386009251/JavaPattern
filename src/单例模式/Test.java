package ����ģʽ;

public class Test {

	public static void main(String[] args) {
		System.out.println("����ʽ"+System.identityHashCode(Demo.getDemo()));
		System.out.println("����ʽ"+System.identityHashCode(Demo.getDemo()));

		System.out.println("����ʽ"+System.identityHashCode(Demo1.getDemo1()));
		System.out.println("����ʽ"+System.identityHashCode(Demo1.getDemo1()));
		
		System.out.println("��̬�ڲ���"+System.identityHashCode(Demo2.getDemo2()));
		System.out.println("��̬�ڲ���"+System.identityHashCode(Demo2.getDemo2()));
		
		System.out.println("ö��"+System.identityHashCode(Demo3.INSTANCE));
		System.out.println("ö��"+System.identityHashCode(Demo3.INSTANCE));
	}
}
