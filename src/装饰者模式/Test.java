package װ����ģʽ;

public class Test {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator(component);
		decorator.operation();
	}
}
