package CC;

public class WhiteChoc extends Topping {


	Cake cake;
	
	public WhiteChoc(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getflavor() {
		// TODO Auto-generated method stub
		return cake.getflavor()+",WhiteChoc";
		}
		
			public double cost(){
				return 45 + cake.cost();
			}
}