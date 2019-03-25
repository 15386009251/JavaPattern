package 观察者模式;

//被观察者接口
public interface Observerable {

	public void registerObserver(ObServer o);
    public void removeObserver(ObServer o);
    public void notifyObserver();
	
}
