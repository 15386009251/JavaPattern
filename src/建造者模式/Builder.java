package 建造者模式;

//建造者接口
public interface Builder {

	public void buildName();
	
	public void buildPrice();
	
	public void buildNum();
	
	public Product buildProduct();
}
