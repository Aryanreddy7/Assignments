class Countries{
	public static void  PrintCountries(String[] Country){
	for(String value:Country){
	if(value.endsWith("A")||value.startsWith("a")){
	System.out.println("Sorted Country: "+value);
	}
	}
	}
	
	
	public static void main(String[] args) {
        String[] countries = {"India", "USA", "anada", "Australia", "China", "Brazil", "Russia"};
		PrintCountries(countries);
		}
}
		