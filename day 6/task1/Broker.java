class Broker{
	public static void brokerage(String vegetable,int quantity){
	System.out.println("Running Broker");
	System.out.println("Vegetable:"+vegetable+"  "+"Quantity:"+quantity);
	Farmer.farm(vegetable,quantity);
	}
	}
	
	