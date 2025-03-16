class Tomato {
    String variety;
    String color;
    float weight;
    boolean organic;
    String origin;
    int ripeness;
    
    public Tomato() {
        System.out.println("Running Tomato:");
    }
    
    public Tomato(String variety) {
        this.variety = variety;
    }
    
    public Tomato(String variety, String color) {
        this(variety);
        this.color = color;
    }
    
    public Tomato(String variety, String color, float weight) {
        this(variety, color);
        this.weight = weight;
    }
    
    public Tomato(String variety, String color, float weight, boolean organic) {
        this(variety, color, weight);
        this.organic = organic;
    }
    
    public Tomato(String variety, String color, float weight, boolean organic, String origin) {
        this(variety, color, weight, organic);
        this.origin = origin;
    }
    
    public Tomato(String variety, String color, float weight, boolean organic, String origin, int ripeness) {
        this(variety, color, weight, organic, origin);
        this.ripeness = ripeness;
    }
    
    void display() {
        System.out.println("Variety: " + variety);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Organic: " + organic);
        System.out.println("Origin: " + origin);
        System.out.println("Ripeness: " + ripeness);
        System.out.println("============================");
    }
}
