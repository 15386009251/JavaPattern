package ������ģʽ;

public class Test {
	
	public static void main(String[] args) {
		Product product = ProductBuilder.getInstance(new CreateBuilder());
		System.out.println(product.toString());
	}
}
