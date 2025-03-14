class Laptop {
	 static void powerOn() { System.out.println("Laptop is powered on."); }
     static void powerOff() { System.out.println("Laptop is shutting down."); }
     static void openBrowser() { System.out.println("Browser is opened."); }
     static void runSoftware() { System.out.println("Running software."); }
     static void checkBattery() { System.out.println("Battery level is good."); }
	public static void main(String[] args){
     powerOn();
	 powerOff();
	 openBrowser();
	 runSoftware();
	 checkBattery();
	 Lap.connectWiFi();
	 Lap.updateSoftware();
	 Lap.playMusic();
	 Lap.showSpecifications();
	 Lap.sleepMode();
	}
}