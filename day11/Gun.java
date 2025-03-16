class Gun {
    String type;
    String model;
    float caliber;
    boolean automatic;
    String manufacturer;
    int capacity;
    
    public Gun() {
        System.out.println("Running Gun:");
    }
    
    public Gun(String type) {
        this.type = type;
    }
    
    public Gun(String type, String model) {
        this(type);
        this.model = model;
    }
    
    public Gun(String type, String model, float caliber) {
        this(type, model);
        this.caliber = caliber;
    }
    
    public Gun(String type, String model, float caliber, boolean automatic) {
        this(type, model, caliber);
        this.automatic = automatic;
    }
    
    public Gun(String type, String model, float caliber, boolean automatic, String manufacturer) {
        this(type, model, caliber, automatic);
        this.manufacturer = manufacturer;
    }
    
    public Gun(String type, String model, float caliber, boolean automatic, String manufacturer, int capacity) {
        this(type, model, caliber, automatic, manufacturer);
        this.capacity = capacity;
    }
    
    void display() {
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Caliber: " + caliber);
        System.out.println("Automatic: " + automatic);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Capacity: " + capacity);
        System.out.println("============================");
    }
}