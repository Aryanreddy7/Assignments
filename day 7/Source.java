class Source{
	public static int price(String sources){
	System.out.println("Source: "+sources);
	if(sources == "Gold"){
		return 7000;
	}
	else if(sources == "Silver"){
		return 700;
	}
	else if (sources == "Platinum") {
		return 2500;
	}	
	else if (sources == "Diamond") {
		return 5000;
	}	
	else if (sources == "Copper") {
		return 300;
	}	
	else if (sources == "Iron") {
		return 400;
	}	
	else if (sources == "Bronze") {
		return 600;
	}	
	else if (sources == "Titanium") {
		return 3500;
	}	
	else if (sources == "Steel") {
		return 800;
	}	
	else if (sources == "Aluminum") {
		return 550;
	}	
	else if (sources == "Nickel") {
		return 900;
	}	
	else if (sources == "Zinc") {
		return 750;
	}	
	else if (sources == "Lead") {
		return 650;
	}	
	else if (sources == "Mercury") {
		return 1200;
	}	
	else if (sources == "Uranium") {
		return 10000;
	}	
	else if (sources == "Quartz") {
		return 200;
	}	
	else if (sources == "Ruby") {
		return 4000;
	}	
	else if (sources == "Sapphire") {
		return 4500;
	}	
	else if (sources == "Emerald") {
		return 4200;
	}
	return 0;
	}
	}