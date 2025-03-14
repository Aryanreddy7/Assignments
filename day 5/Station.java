class Station{
	public static void send(String item){
	System.out.println("nam:" +item);
	Delivery.accept(item);
	}
	}