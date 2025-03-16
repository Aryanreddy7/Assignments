class Egg {
    String color;
    String type;
    boolean boiled;
    float weight;
    String origin;
    int size;
    
    public Egg() {
        System.out.println("Running Egg:");
    }
    
    public Egg(String color) {
        this.color = color;
    }
    
    public Egg(String color, String type) {
        this(color);
        this.type = type;
    }
    
    public Egg(String color, String type, boolean boiled) {
        this(color, type);
        this.boiled = boiled;
    }
    
    public Egg(String color, String type, boolean boiled, float weight) {
        this(color, type, boiled);
        this.weight = weight;
    }
    
    public Egg(String color, String type, boolean boiled, float weight, String origin) {
        this(color, type, boiled, weight);
        this.origin = origin;
    }
    
    public Egg(String color, String type, boolean boiled, float weight, String origin, int size) {
        this(color, type, boiled, weight, origin);
        this.size = size;
    }
    
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Boiled: " + boiled);
        System.out.println("Weight: " + weight);
        System.out.println("Origin: " + origin);
        System.out.println("Size: " + size);
        System.out.println("============================");
    }
}