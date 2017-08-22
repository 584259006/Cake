package CC;

public abstract class Cake {

	String flavor = "Unknow flavor";
	
	public String getflavor(){
		return flavor;
	
	}
	
	public abstract double cost();
}