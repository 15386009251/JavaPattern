package 工厂模式;

//多方法静态工厂
public class Demo2 {

	public static INoodles getLanZINoodles(){
		return new LanZINoodles();
	}
	
	public static INoodles getPaoINoodles(){
		return new PaoINoodles();
	}
	
	public static INoodles getReGanINoodles(){
		return new ReGanINoodles();
	}
}
