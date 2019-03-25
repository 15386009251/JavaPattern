package �۲���ģʽ;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {

	private List<ObServer> list;
    private String message;
    
    public WechatServer() {
		// TODO Auto-generated constructor stub
    	list = new ArrayList<ObServer>();
	}
	
	@Override
	public void registerObserver(ObServer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void removeObserver(ObServer o) {
		// TODO Auto-generated method stub
		if (!list.isEmpty())
			list.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		list.forEach((oserver) -> oserver.update(message));
	}
	
	public void setInfomation(String s) {
        this.message = s;
        System.out.println("΢�ŷ��������Ϣ�� " + s);
        //��Ϣ���£�֪ͨ���й۲���
        notifyObserver();
    }

}
