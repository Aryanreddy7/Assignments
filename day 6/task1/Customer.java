class Customer{
	public static void buy(String vegetable,int quantity){
	System.out.println("Running Customer");
	System.out.println("Vegetable:"+vegetable+"  "+"Quantity:"+quantity);
	Shop.sell(vegetable,quantity);
	}
	}