package ������ģʽ;

//ִ�н�����
public class ProductBuilder {
	
	public static Product getInstance(CreateBuilder builder){
		builder.buildName();
		builder.buildPrice();
		builder.buildNum();
		return builder.buildProduct();
	}

}
