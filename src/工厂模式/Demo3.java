package 工厂模式;

import 工厂模式.Demo1.Factory;

//抽象工厂
public class Demo3 {

	public static abstract class Factory{
		
		public abstract INoodles getINoodles();
		public abstract Drinks getDrinks();
	}
	
	public static class LanZFactory extends Factory{

		@Override
		public INoodles getINoodles() {
			return new LanZINoodles();
		}

		@Override
		public Drinks getDrinks() {
			// TODO Auto-generated method stub
			return new Water();
		}
		
	}
	
	public static class PaoFactory extends Factory{

		@Override
		public INoodles getINoodles() {
			return new PaoINoodles();
		}

		@Override
		public Drinks getDrinks() {
			// TODO Auto-generated method stub
			return new Cola();
		}
		
	}
	
	public static class ReGanFactory extends Factory {

		@Override
		public INoodles getINoodles() {
			// TODO Auto-generated method stub
			return new ReGanINoodles();
		}

		@Override
		public Drinks getDrinks() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
