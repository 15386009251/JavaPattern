package �۲���ģʽ;

public class Test {

	public static void main(String[] args) {
	
		WechatServer o = new WechatServer();
		o.registerObserver(new User("aaa"));
		o.registerObserver(new User("bbb"));
		o.registerObserver(new User("ccc"));
		o.setInfomation("1111111111");
	}
	
}
