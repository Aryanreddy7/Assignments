class Bracelet {
    static void silver() {
		System.out.println("Running Bracelet");
        System.out.println("Bracelet: Silver bracelet");
        diamond();
		platinum();
    }
    static void gold() {
        System.out.println("Bracelet: Gold bracelet");
		Wire.copper();
		Wire.electric();
        
    }
    static void diamond() {
        System.out.println("Bracelet: Diamond bracelet");
    }
    static void platinum() {
        System.out.println("Bracelet: Platinum bracelet");
    }
}