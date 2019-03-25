package 工厂模式;

//普通工厂
public class Demo1 {
	
	public interface Factory{
		
		public INoodles getINoodles();
	}
	
	public static class LanZFactory implements Factory{

		@Override
		public INoodles getINoodles() {
			return new LanZINoodles();
		}
		
	}
	
	public static class PaoFactory implements Factory{

		@Override
		public INoodles getINoodles() {
			return new PaoINoodles();
		}
		
	}
	
	public static class reGanFactory implements Factory{

		@Override
		public INoodles getINoodles() {
			return new ReGanINoodles();
		}
		
	}
	
}
