package 装饰者模式;

//抽象装饰者角色
public class Decorator implements Component {
	
	private Component component;
	
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		component.operation();
	}

}
