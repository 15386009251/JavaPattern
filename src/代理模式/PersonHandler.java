package ����ģʽ;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//��̬����ģʽ
public class PersonHandler implements InvocationHandler{
	
	private Object target;
	
	public PersonHandler(Object obj){
		this.target = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ǰ������");
		System.out.println("proxy:"+proxy.getClass().getName());
		Object object = method.invoke(target, args);
		System.out.println("��������");
		return object;
	}

}
