package 观察者模式;

public class User implements ObServer {

	private String name;
    private String message;
    
    public User(String name) {
        this.name = name;
    }
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.message = message;
        read();
	}

	public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
