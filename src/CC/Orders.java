package CC;

public class Orders {

	public static void main (String[] args ){
		Cake c1 = new Choc ();
		System.out.println(c1.getflavor() + " Bath " +c1.cost());
		
		Cake c2 = new GreenT ();
		c2 = new WhiteChoc (c2);
		c2 = new Brownnie (c2);
		System.out.println(c2.getflavor() + " Bath "+c2.cost ());
	
		
}
}