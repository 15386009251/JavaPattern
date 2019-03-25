package 单例模式;

//饿汉式单例模式
public class Demo {

	private static Demo demo = new Demo();
	
	private Demo(){}
	
	public static Demo getDemo(){
		return demo;
	}
}
