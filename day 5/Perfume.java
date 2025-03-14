class Perfume {
    static void floral() {
		System.out.println("Running Perfume");
        System.out.println("Perfume: Floral scent");
        citrus();
		woody();
    }
    static void musk() {
        System.out.println("Perfume: Musk scent");
		Bracelet.silver();
		Bracelet.gold();
      
    }
    static void citrus() {
        System.out.println("Perfume: Citrus scent");
    }
    static void woody() {
        System.out.println("Perfume: Woody scent");
    }
}