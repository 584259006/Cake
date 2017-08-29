package CC;

public class Orders {

	public static void main (String[] args ){
		Cake c1 = new Choc ();
		System.out.println(c1.getflavor()+ "  Price  " +  c1.cost ()+ " Bath " );
		
		Cake c2 = new GreenT ();
		c2 = new WhiteChoc (c2);
		c2 = new Brownnie (c2);
		System.out.println(  c2.getflavor()  + "  Price  " +   c2.cost ()+ " Bath " );
	
		Cake c3 = new GreenT ();
		c3 = new Jam (c3);
		c3 = new Fruit (c3);
		c3 = new Fruit (c3);
		System.out.println(c3.getflavor() + "  Price  "+c3.cost ()+ " Bath ");
		
}
}