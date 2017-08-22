package CC;

public class Chocchip extends Topping {


	Cake cake;
	
	public Chocchip(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getflavor() {
		// TODO Auto-generated method stub
		return cake.getflavor()+",Chocchip";
		}
		
			public double cost(){
				return 30 + cake.cost();
			}
}