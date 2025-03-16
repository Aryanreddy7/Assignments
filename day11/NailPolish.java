class NailPolish {
    String color;
    String brand;
    float volume;
    boolean quickDry;
    String finish;
    int durability;
    
    public NailPolish() {
        System.out.println("Running NailPolish:");
    }
    
    public NailPolish(String color) {
        this.color = color;
    }
    
    public NailPolish(String color, String brand) {
        this(color);
        this.brand = brand;
    }
    
    public NailPolish(String color, String brand, float volume) {
        this(color, brand);
        this.volume = volume;
    }
    
    public NailPolish(String color, String brand, float volume, boolean quickDry) {
        this(color, brand, volume);
        this.quickDry = quickDry;
    }
    
    public NailPolish(String color, String brand, float volume, boolean quickDry, String finish) {
        this(color, brand, volume, quickDry);
        this.finish = finish;
    }
    
    public NailPolish(String color, String brand, float volume, boolean quickDry, String finish, int durability) {
        this(color, brand, volume, quickDry, finish);
        this.durability = durability;
    }
    
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Volume: " + volume);
        System.out.println("Quick Dry: " + quickDry);
        System.out.println("Finish: " + finish);
        System.out.println("Durability: " + durability);
        System.out.println("============================");
    }
}
