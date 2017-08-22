package CC;

public class Brownnie extends Topping {


	Cake cake;
	
	public Brownnie(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getflavor() {
		// TODO Auto-generated method stub
		return cake.getflavor()+",Brownnie";
		}
		
			public double cost(){
				return 65 + cake.cost();
			}
}