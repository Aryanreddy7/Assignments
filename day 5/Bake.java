class Bake{
	public static void main(String[] args){
	String iname="Cake";
	int quantity=4;
	Bakery.buy(iname,quantity);
	
	Boolean op=true;
	Bakery.open(op);
	
	Boolean clo=true;
	Bakery.close(clo);
	
	String oname="Nikhil";
	Bakery.owner(oname);
	
	String cname="Shashank";
	Bakery.cashier(cname);
	}
	}
	