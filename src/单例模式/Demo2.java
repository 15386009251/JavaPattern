package ����ģʽ;

//��̬�ڲ���
public class Demo2 {
	
	private Demo2(){}

	private static class Demo2Instance{
		private static final Demo2 demo = new Demo2();
	}
	
	public static Demo2 getDemo2(){
		return Demo2Instance.demo;
	}
}
