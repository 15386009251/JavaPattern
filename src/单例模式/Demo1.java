package ����ģʽ;

//����ʽ����
public class Demo1 {

	private static Demo1 demo;
	
	private Demo1(){};
	
	public static Demo1 getDemo1(){
		if (demo != null) {
			demo = new Demo1();
		}
		return demo;
	}
	
}
