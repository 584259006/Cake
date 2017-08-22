package CC;

public class Fruit extends Topping {


	Cake cake;
	
	public Fruit(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getflavor() {
		// TODO Auto-generated method stub
		return cake.getflavor()+",Fruit";
		}
		
			public double cost(){
				return 50 + cake.cost();
			}
}