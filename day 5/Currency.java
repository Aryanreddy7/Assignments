class Currency {
    static void dollar() {
		System.out.println("Running Currency");
        System.out.println("Currency: US Dollar");
        yen();
		rupee();
    }
    static void euro() {
        System.out.println("Currency: Euro");
		Wallet.leather();
		Wallet.cloth();
        
    }
    static void yen() {
        System.out.println("Currency: Japanese Yen");
    }
    static void rupee() {
        System.out.println("Currency: Indian Rupee");
    }
}