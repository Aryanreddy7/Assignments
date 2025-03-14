class Agent{
	public static void purchase(String vegetable,int quantity){
	System.out.println("Running Agent");
	System.out.println("Vegetable:"+vegetable+"  "+"Quantity:"+quantity);
	Broker.brokerage(vegetable,quantity);
	}
	}