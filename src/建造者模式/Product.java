package 建造者模式;

//建造的对象
public class Product {
	
	private String name;
	private double price;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	
}
