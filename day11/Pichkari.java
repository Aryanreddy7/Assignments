class Pichkari {
    String color;
    int size;
    String material;
    float pressure;
    String brand;
    boolean refillable;
    
    public Pichkari() {
        System.out.println("Running Pichkari:");
    }
    
    public Pichkari(String color) {
        this.color = color;
    }
    
    public Pichkari(String color, int size) {
        this(color);
        this.size = size;
    }
    
    public Pichkari(String color, int size, String material) {
        this(color, size);
        this.material = material;
    }
    
    public Pichkari(String color, int size, String material, float pressure) {
        this(color, size, material);
        this.pressure = pressure;
    }
    
    public Pichkari(String color, int size, String material, float pressure, String brand) {
        this(color, size, material, pressure);
        this.brand = brand;
    }
    
    public Pichkari(String color, int size, String material, float pressure, String brand, boolean refillable) {
        this(color, size, material, pressure, brand);
        this.refillable = refillable;
    }
    
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Pressure: " + pressure);
        System.out.println("Brand: " + brand);
        System.out.println("Refillable: " + refillable);
        System.out.println("============================");
    }
}