package 单例模式;

public class Test {

	public static void main(String[] args) {
		System.out.println("饿汉式"+System.identityHashCode(Demo.getDemo()));
		System.out.println("饿汉式"+System.identityHashCode(Demo.getDemo()));

		System.out.println("懒汉式"+System.identityHashCode(Demo1.getDemo1()));
		System.out.println("懒汉式"+System.identityHashCode(Demo1.getDemo1()));
		
		System.out.println("静态内部类"+System.identityHashCode(Demo2.getDemo2()));
		System.out.println("静态内部类"+System.identityHashCode(Demo2.getDemo2()));
		
		System.out.println("枚举"+System.identityHashCode(Demo3.INSTANCE));
		System.out.println("枚举"+System.identityHashCode(Demo3.INSTANCE));
	}
}
