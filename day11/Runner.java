class Runner { 
    public static void main(String[] values) {
        Balloon balloon = new Balloon();
        Balloon balloon1 = new Balloon("gold", 3, "plastic", 2.0f, 'A', false);
        Balloon balloon2 = new Balloon("teal", 6, "nylon", 1.5f, 'C', true);
        Balloon balloon3 = new Balloon("magenta", 5, "rubber", 2.3f, 'B', false);
        Balloon balloon4 = new Balloon("navy", 4, "latex", 1.9f, 'A', true);
        Balloon balloon5 = new Balloon("brown", 7, "foil", 2.1f, 'C', false);
        Balloon balloon6 = new Balloon("olive", 3, "polyester", 1.4f, 'B', true);
        Balloon balloon7 = new Balloon("maroon", 2, "silicone", 1.8f, 'A', false);

        balloon.display();
        balloon1.display();
        balloon2.display();
        balloon3.display();
        balloon4.display();
        balloon5.display();
        balloon6.display();
        balloon7.display();
		
		Holi holi1 = new Holi("Dry", "Holi", true, "North India", 5, 3.5f);
        Holi holi2 = new Holi("Wet", "Festival of Colors", false, "South India", 7, 4.0f);
        Holi holi3 = new Holi("Organic", "Eco Holi", true, "West India", 6, 3.0f);
        Holi holi4 = new Holi("Chemical", "Traditional", false, "East India", 8, 5.0f);
        Holi holi5 = new Holi("Mixed", "Modern", true, "Central India", 4, 2.5f);
        Holi holi6 = new Holi("Safe", "Kids Special", true, "Urban Areas", 3, 2.0f);
        Holi holi7 = new Holi("Synthetic", "Festival", false, "Rural Areas", 9, 5.5f);
        
		holi1.display();
        holi2.display();
        holi3.display();
        holi4.display();
        holi5.display();
        holi6.display();
        holi7.display();
		
		Pichkari pichkari1 = new Pichkari("Red", 15, "Plastic", 2.0f, "FunBlast", true);
        Pichkari pichkari2 = new Pichkari("Blue", 12, "Metal", 1.8f, "AquaShot", false);
        Pichkari pichkari3 = new Pichkari("Green", 10, "Plastic", 2.2f, "SplashKing", true);
        Pichkari pichkari4 = new Pichkari("Yellow", 14, "Aluminum", 1.5f, "HoliBlaster", false);
        Pichkari pichkari5 = new Pichkari("Pink", 16, "Silicone", 2.5f, "WaterSpray", true);
        Pichkari pichkari6 = new Pichkari("Orange", 18, "Rubber", 1.9f, "ColorSplash", false);
        Pichkari pichkari7 = new Pichkari("Purple", 20, "Glass", 2.8f, "JetStream", true);
		
		pichkari1.display();
        pichkari2.display();
        pichkari3.display();
        pichkari4.display();
        pichkari5.display();
        pichkari6.display();
        pichkari7.display();
		
		Color color1 = new Color("Red", "Dry", true, 5, "India", 2.5f);
        Color color2 = new Color("Blue", "Wet", false, 7, "USA", 3.0f);
        Color color3 = new Color("Green", "Organic", true, 6, "India", 2.8f);
        Color color4 = new Color("Yellow", "Chemical", false, 8, "China", 3.5f);
        Color color5 = new Color("Pink", "Mixed", true, 4, "Japan", 2.2f);
        Color color6 = new Color("Orange", "Safe", true, 3, "India", 1.9f);
        Color color7 = new Color("Purple", "Synthetic", false, 9, "Germany", 4.0f);
        
        color1.display();
        color2.display();
        color3.display();
        color4.display();
        color5.display();
        color6.display();
        color7.display();
		
		Egg egg1 = new Egg("White", "Chicken", true, 50.5f, "USA", 3);
        Egg egg2 = new Egg("Brown", "Duck", false, 60.2f, "Canada", 4);
        Egg egg3 = new Egg("Speckled", "Quail", true, 20.1f, "India", 2);
        Egg egg4 = new Egg("White", "Ostrich", false, 1500.0f, "Africa", 10);
        Egg egg5 = new Egg("Blue", "Araucana", true, 55.3f, "Chile", 3);
        Egg egg6 = new Egg("Green", "Pheasant", false, 45.0f, "Japan", 2);
        Egg egg7 = new Egg("Cream", "Turkey", true, 70.4f, "Mexico", 5);
        
        egg1.display();
        egg2.display();
        egg3.display();
        egg4.display();
        egg5.display();
        egg6.display();
        egg7.display();
		
		Bucket bucket1 = new Bucket("Plastic", "Red", 10, true, 12.5f, "Round");
        Bucket bucket2 = new Bucket("Metal", "Blue", 12, false, 15.0f, "Square");
        Bucket bucket3 = new Bucket("Steel", "Silver", 15, true, 14.8f, "Oval");
        Bucket bucket4 = new Bucket("Wood", "Brown", 8, true, 11.3f, "Cylindrical");
        Bucket bucket5 = new Bucket("Iron", "Black", 20, false, 18.7f, "Rectangular");
        Bucket bucket6 = new Bucket("Copper", "Gold", 10, true, 12.0f, "Round");
        Bucket bucket7 = new Bucket("Fiberglass", "White", 13, true, 13.5f, "Hexagonal");
        
        bucket1.display();
        bucket2.display();
        bucket3.display();
        bucket4.display();
        bucket5.display();
        bucket6.display();
        bucket7.display();
		
		Tomato tomato1 = new Tomato("Cherry", "Red", 0.02f, true, "Italy", 8);
        Tomato tomato2 = new Tomato("Beefsteak", "Pink", 0.15f, false, "USA", 7);
        Tomato tomato3 = new Tomato("Roma", "Red", 0.1f, true, "Mexico", 9);
        Tomato tomato4 = new Tomato("Grape", "Yellow", 0.025f, false, "Spain", 6);
        Tomato tomato5 = new Tomato("Heirloom", "Purple", 0.2f, true, "France", 7);
        Tomato tomato6 = new Tomato("Plum", "Orange", 0.12f, false, "India", 8);
        Tomato tomato7 = new Tomato("Campari", "Bright Red", 0.08f, true, "Canada", 9);
        
        tomato1.display();
        tomato2.display();
        tomato3.display();
        tomato4.display();
        tomato5.display();
        tomato6.display();
        tomato7.display();
		
		Gun gun1 = new Gun("Pistol", "Glock 19", 9.0f, true, "Glock", 15);
        Gun gun2 = new Gun("Rifle", "AR-15", 5.56f, false, "Colt", 30);
        Gun gun3 = new Gun("Shotgun", "Remington 870", 12.0f, false, "Remington", 5);
        Gun gun4 = new Gun("SMG", "MP5", 9.0f, true, "Heckler & Koch", 30);
        Gun gun5 = new Gun("Revolver", "Colt Python", 0.357f, false, "Colt", 6);
        Gun gun6 = new Gun("Sniper", "Barrett M82", 50.0f, false, "Barrett", 10);
        Gun gun7 = new Gun("Machine Gun", "M249", 5.56f, true, "FN Herstal", 100);
        
        gun1.display();
        gun2.display();
        gun3.display();
        gun4.display();
        gun5.display();
        gun6.display();
        gun7.display();
		
		WaterBall waterBall1 = new WaterBall("Rubber", "Blue", 3.5f, true, "AquaPlay", 10);
        WaterBall waterBall2 = new WaterBall("Plastic", "Red", 4.0f, false, "SplashZone", 15);
        WaterBall waterBall3 = new WaterBall("Silicone", "Green", 3.2f, true, "WaterFun", 12);
        WaterBall waterBall4 = new WaterBall("Latex", "Yellow", 4.5f, false, "HydroBlast", 20);
        WaterBall waterBall5 = new WaterBall("Gel", "Pink", 3.8f, true, "SoakAttack", 8);
        WaterBall waterBall6 = new WaterBall("Foam", "Orange", 3.6f, false, "AquaSplash", 18);
        WaterBall waterBall7 = new WaterBall("Biodegradable", "Purple", 4.2f, true, "EcoSplash", 25);
        
        waterBall1.display();
        waterBall2.display();
        waterBall3.display();
        waterBall4.display();
        waterBall5.display();
        waterBall6.display();
        waterBall7.display();
		
		NailPolish nailPolish1 = new NailPolish("Red", "Lakme", 10.5f, true, "Glossy", 7);
        NailPolish nailPolish2 = new NailPolish("Pink", "Maybelline", 12.0f, false, "Matte", 5);
        NailPolish nailPolish3 = new NailPolish("Blue", "Revlon", 9.5f, true, "Shimmer", 6);
        NailPolish nailPolish4 = new NailPolish("Green", "Sally Hansen", 11.0f, false, "Glossy", 8);
        NailPolish nailPolish5 = new NailPolish("Black", "OPI", 13.5f, true, "Matte", 10);
        NailPolish nailPolish6 = new NailPolish("White", "Colorbar", 10.0f, false, "Pearl", 4);
        NailPolish nailPolish7 = new NailPolish("Purple", "Nykaa", 8.5f, true, "Glitter", 9);
        
        nailPolish1.display();
        nailPolish2.display();
        nailPolish3.display();
        nailPolish4.display();
        nailPolish5.display();
        nailPolish6.display();
        nailPolish7.display();
		
		Water water1 = new Water("Spring", "Mineral", 7.2f, true, "Bottle", 500);
        Water water2 = new Water("Well", "Groundwater", 6.8f, false, "Can", 1000);
        Water water3 = new Water("River", "Freshwater", 7.0f, false, "Jar", 2000);
        Water water4 = new Water("Rain", "Distilled", 6.5f, true, "Pouch", 250);
        Water water5 = new Water("Tap", "Municipal", 7.5f, true, "Glass", 300);
        Water water6 = new Water("Ocean", "Saltwater", 8.1f, false, "Tank", 5000);
        Water water7 = new Water("Glacier", "Ice Melt", 7.8f, true, "Bottle", 750);
        
        water1.display();
        water2.display();
        water3.display();
        water4.display();
        water5.display();
        water6.display();
        water7.display();
    }
    }