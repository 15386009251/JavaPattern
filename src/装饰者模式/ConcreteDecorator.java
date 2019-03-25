package 装饰者模式;

//具体装饰者角色
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void operation(){
		super.operation();
		addedFunction();
	}

	public void addedFunction(){
        System.out.println("为具体构件角色增加额外的功能addedFunction()");           
    }
}
