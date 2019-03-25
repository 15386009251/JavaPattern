package 工厂模式;


//简单工厂模式
public class Demo {
	
	public static final int TYPE_LZ = 1;
	public static final int TYPE_P = 2;
	public static final int TYPE_RG = 3;
	
	public static INoodles getINoodles(int type){
		switch (type) {
			case TYPE_LZ:
				return new LanZINoodles();
			case TYPE_P:
				return new PaoINoodles();
			default:
				return new ReGanINoodles();
		}
	}
	
}
