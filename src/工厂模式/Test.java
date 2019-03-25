package 工厂模式;

import 工厂模式.Demo3.PaoFactory;

public class Test {
	public static void main(String[] args) {
		//INoodles iNoodles = Demo.getINoodles(2);
		//iNoodles.desc();
		
		Demo1.Factory factory = new Demo1.PaoFactory();
		factory.getINoodles().desc();
		
		PaoFactory paoFactory = new Demo3.PaoFactory();
		paoFactory.getINoodles().desc();
		paoFactory.getDrinks().desc();
		
		
	}
}
