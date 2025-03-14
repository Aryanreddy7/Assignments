class Wallet {
    static void leather() {
		System.out.println("Running Wallet");
        System.out.println("Wallet: Leather wallet");
        plastic();
		digital();
    }
    static void cloth() {
        System.out.println("Wallet: Cloth wallet");
		Perfume.floral();
		Perfume.musk();

    }
    static void plastic() {
        System.out.println("Wallet: Plastic wallet");
    }
    static void digital() {
        System.out.println("Wallet: Digital wallet");
    }
}