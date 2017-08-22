package CC;

public class FreshStaw extends Topping {


	Cake cake;
	
	public FreshStaw(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getflavor() {
		// TODO Auto-generated method stub
		return cake.getflavor()+",FreshStaw";
		}
		
			public double cost(){
				return 80 + cake.cost();
			}
}