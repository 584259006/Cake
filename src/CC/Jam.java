package CC;

public class Jam extends Topping {


	Cake cake;
	
	public Jam(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getflavor() {
		// TODO Auto-generated method stub
		return cake.getflavor()+",Jam";
		}
		
			public double cost(){
				return 25 + cake.cost();
			}
}