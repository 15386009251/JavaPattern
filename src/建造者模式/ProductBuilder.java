package 建造者模式;

//执行建造者
public class ProductBuilder {
	
	public static Product getInstance(CreateBuilder builder){
		builder.buildName();
		builder.buildPrice();
		builder.buildNum();
		return builder.buildProduct();
	}

}
