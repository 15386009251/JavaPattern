package 装饰者模式;

public class Test {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator(component);
		decorator.operation();
	}
}
