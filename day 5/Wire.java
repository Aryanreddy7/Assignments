class Wire {
    static void copper() {
		System.out.println("Running Wire");
        System.out.println("Wire: Copper wire");
        fiber();
		steel();
    }
    static void electric() {
        System.out.println("Wire: Electric wire");
		Gold.pure();
		Gold.ring();
        
    }
    static void fiber() {
        System.out.println("Wire: Fiber optic wire");
    }
    static void steel() {
        System.out.println("Wire: Steel wire");
    }
}	