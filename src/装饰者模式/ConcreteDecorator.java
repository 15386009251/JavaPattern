package װ����ģʽ;

//����װ���߽�ɫ
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
        System.out.println("Ϊ���幹����ɫ���Ӷ���Ĺ���addedFunction()");           
    }
}
