class Trafficsignal {
    static void redLight() {
		System.out.println("Running Trafficsignal");
        System.out.println("Traffic Signal: Stop");
        yellowLight();
		blueLight();
    }
    static void greenLight() {
        System.out.println("Traffic Signal: Go");
		   
    }
    static void yellowLight() {
        System.out.println("Traffic Signal: Slow down");
    }
    static void blueLight() {
        System.out.println("Traffic Signal: Special indication");
    }
}