package �۲���ģʽ;

//���۲��߽ӿ�
public interface Observerable {

	public void registerObserver(ObServer o);
    public void removeObserver(ObServer o);
    public void notifyObserver();
	
}
