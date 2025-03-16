class WaterBall {
    String material;
    String color;
    float diameter;
    boolean reusable;
    String brand;
    int quantity;
    
    public WaterBall() {
        System.out.println("Running WaterBall:");
    }
    
    public WaterBall(String material) {
        this.material = material;
    }
    
    public WaterBall(String material, String color) {
        this(material);
        this.color = color;
    }
    
    public WaterBall(String material, String color, float diameter) {
        this(material, color);
        this.diameter = diameter;
    }
    
    public WaterBall(String material, String color, float diameter, boolean reusable) {
        this(material, color, diameter);
        this.reusable = reusable;
    }
    
    public WaterBall(String material, String color, float diameter, boolean reusable, String brand) {
        this(material, color, diameter, reusable);
        this.brand = brand;
    }
    
    public WaterBall(String material, String color, float diameter, boolean reusable, String brand, int quantity) {
        this(material, color, diameter, reusable, brand);
        this.quantity = quantity;
    }
    
    void display() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Diameter: " + diameter);
        System.out.println("Reusable: " + reusable);
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
        System.out.println("============================");
    }
}
