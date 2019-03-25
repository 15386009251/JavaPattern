package 装饰者模式;

//具体抽象构建角色
public class ConcreteComponent implements Component{

	public ConcreteComponent(){
        System.out.println("创建具体构件角色");
    }
    
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("调用具体的方法");
	}

}
