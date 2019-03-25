package 建造者模式;

//建造者
public class CreateBuilder implements Builder {

	private Product product;
	
	public CreateBuilder() {
		// TODO Auto-generated constructor stub
		product = new Product();
	}
	
	@Override
	public void buildName() {
		// TODO Auto-generated method stub
		product.setName("aaa");
	}

	@Override
	public void buildPrice() {
		// TODO Auto-generated method stub
		product.setPrice(1.23);
	}

	@Override
	public void buildNum() {
		// TODO Auto-generated method stub
		product.setNum(3);
	}

	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return product;
	}

}
