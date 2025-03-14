class MainRunner {
    public static void main(String[] args) {
        Metro metro1 = new Metro();
        Metro metro2 = new Metro();
        Metro metro3 = new Metro();
        Metro metro4 = new Metro();
        Metro metro5 = new Metro();
        Metro metro6 = new Metro();
        Metro metro7 = new Metro();
        Metro metro8 = new Metro();
        Metro metro9 = new Metro();
        Metro metro10 = new Metro();
		metro1.speed = 80; metro1.capacity = 1000; metro1.type = "City Metro"; metro1.operational = true;
        metro2.speed = 90; metro2.capacity = 1200; metro2.type = "Express Metro"; metro2.operational = true;
        metro3.speed = 75; metro3.capacity = 900; metro3.type = "Underground Metro"; metro3.operational = false;
        metro4.speed = 85; metro4.capacity = 1100; metro4.type = "Rapid Metro"; metro4.operational = true;
        metro5.speed = 100; metro5.capacity = 1300; metro5.type = "Bullet Metro"; metro5.operational = true;
        metro6.speed = 70; metro6.capacity = 850; metro6.type = "Suburban Metro"; metro6.operational = false;
        metro7.speed = 95; metro7.capacity = 1250; metro7.type = "Luxury Metro"; metro7.operational = true;
        metro8.speed = 78; metro8.capacity = 980; metro8.type = "City Light Metro"; metro8.operational = false;
        metro9.speed = 82; metro9.capacity = 1020; metro9.type = "Automated Metro"; metro9.operational = true;
        metro10.speed = 88; metro10.capacity = 1150; metro10.type = "Magnetic Metro"; metro10.operational = true;

		
		Industry industry = new Industry();
        industry.workers = 500; industry.productionRate = 120.5; industry.category = "Manufacturing"; industry.running = true;
        
        PowerBank powerBank = new PowerBank();
        powerBank.capacity = 20000; powerBank.weight = 0.4; powerBank.brand = "Anker"; powerBank.fastCharging = true;
        
        Bottle bottle = new Bottle();
        bottle.volume = 1000; bottle.weight = 0.5; bottle.material = "Steel"; bottle.reusable = true;
        
        Lamp lamp = new Lamp();
        lamp.brightness = 800; lamp.powerConsumption = 10.5; lamp.type = "LED"; lamp.smartLamp = true;
        
        Earth earth = new Earth();
        earth.radius = 6371; earth.gravity = 9.8; earth.planetType = "Terrestrial"; earth.habitable = true;
        
        Bullet bullet = new Bullet();
        bullet.speed = 900; bullet.caliber = 5.56; bullet.material = "Lead"; bullet.lethal = true;
        
        Flag flag = new Flag();
        flag.height = 3; flag.width = 1.5; flag.country = "USA"; flag.flying = true;
        
        Chocolate chocolate = new Chocolate();
        chocolate.weight = 250; chocolate.cocoaPercentage = 70.5; chocolate.brand = "Lindt"; chocolate.darkChocolate = true;
        
        Camera camera = new Camera();
        camera.resolution = 48; camera.lensSize = 24.7; camera.brand = "Canon"; camera.digital = true;
        
        Train train = new Train();
        train.speed = 300; train.length = 200.5; train.type = "Bullet Train"; train.electric = true;
        
        Road road = new Road();
        road.length = 1000; road.width = 10.5; road.material = "Asphalt"; road.highway = true;


        
        System.out.println("Metro 1: Speed=" + metro1.speed + " km/h, Capacity=" + metro1.capacity + ", Type=" + metro1.type + ", Operational=" + metro1.operational);
        System.out.println("Metro 2: Speed=" + metro2.speed + " km/h, Capacity=" + metro2.capacity + ", Type=" + metro2.type + ", Operational=" + metro2.operational);
        System.out.println("Metro 3: Speed=" + metro3.speed + " km/h, Capacity=" + metro3.capacity + ", Type=" + metro3.type + ", Operational=" + metro3.operational);
        System.out.println("Metro 4: Speed=" + metro4.speed + " km/h, Capacity=" + metro4.capacity + ", Type=" + metro4.type + ", Operational=" + metro4.operational);
        System.out.println("Metro 5: Speed=" + metro5.speed + " km/h, Capacity=" + metro5.capacity + ", Type=" + metro5.type + ", Operational=" + metro5.operational);
        System.out.println("Metro 6: Speed=" + metro6.speed + " km/h, Capacity=" + metro6.capacity + ", Type=" + metro6.type + ", Operational=" + metro6.operational);
        System.out.println("Metro 7: Speed=" + metro7.speed + " km/h, Capacity=" + metro7.capacity + ", Type=" + metro7.type + ", Operational=" + metro7.operational);
        System.out.println("Metro 8: Speed=" + metro8.speed + " km/h, Capacity=" + metro8.capacity + ", Type=" + metro8.type + ", Operational=" + metro8.operational);
        System.out.println("Metro 9: Speed=" + metro9.speed + " km/h, Capacity=" + metro9.capacity + ", Type=" + metro9.type + ", Operational=" + metro9.operational);
        System.out.println("Metro 10: Speed=" + metro10.speed + " km/h, Capacity=" + metro10.capacity + ", Type=" + metro10.type + ", Operational=" + metro10.operational);
		System.out.println("====================================");
		
		
        System.out.println("Industry: Workers=" + industry.workers + ", ProductionRate=" + industry.productionRate + ", Category=" + industry.category + ", Running=" + industry.running);
		System.out.println("====================================");
		System.out.println("PowerBank: Capacity=" + powerBank.capacity + "mAh, Weight=" + powerBank.weight + "kg, Brand=" + powerBank.brand + ", FastCharging=" + powerBank.fastCharging);
        System.out.println("====================================");
		System.out.println("Bottle: Volume=" + bottle.volume + "ml, Weight=" + bottle.weight + "kg, Material=" + bottle.material + ", Reusable=" + bottle.reusable);
        System.out.println("====================================");
		System.out.println("Lamp: Brightness=" + lamp.brightness + "lm, PowerConsumption=" + lamp.powerConsumption + "W, Type=" + lamp.type + ", SmartLamp=" + lamp.smartLamp);
        System.out.println("====================================");
		System.out.println("Earth: Radius=" + earth.radius + "km, Gravity=" + earth.gravity + "m/s², PlanetType=" + earth.planetType + ", Habitable=" + earth.habitable);
        System.out.println("====================================");
		System.out.println("Bullet: Speed=" + bullet.speed + "m/s, Caliber=" + bullet.caliber + "mm, Material=" + bullet.material + ", Lethal=" + bullet.lethal);
        System.out.println("====================================");
		System.out.println("Flag: Height=" + flag.height + "m, Width=" + flag.width + "m, Country=" + flag.country + ", Flying=" + flag.flying);
        System.out.println("====================================");
		System.out.println("Chocolate: Weight=" + chocolate.weight + "g, CocoaPercentage=" + chocolate.cocoaPercentage + "%, Brand=" + chocolate.brand + ", DarkChocolate=" + chocolate.darkChocolate);
        System.out.println("====================================");
		System.out.println("Camera: Resolution=" + camera.resolution + "MP, LensSize=" + camera.lensSize + "mm, Brand=" + camera.brand + ", Digital=" + camera.digital);
        System.out.println("====================================");
		System.out.println("Train: Speed=" + train.speed + "km/h, Length=" + train.length + "m, Type=" + train.type + ", Electric=" + train.electric);
        System.out.println("====================================");
		System.out.println("Road: Length=" + road.length + "km, Width=" + road.width + "m, Material=" + road.material + ", Highway=" + road.highway);
    }
}