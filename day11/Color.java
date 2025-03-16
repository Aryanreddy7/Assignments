class Color {
    String shade;
    String type;
    boolean washable;
    int intensity;
    String origin;
    float weight;
    
    public Color() {
        System.out.println("Running Color:");
    }
    
    public Color(String shade) {
        this.shade = shade;
    }
    
    public Color(String shade, String type) {
        this(shade);
        this.type = type;
    }
    
    public Color(String shade, String type, boolean washable) {
        this(shade, type);
        this.washable = washable;
    }
    
    public Color(String shade, String type, boolean washable, int intensity) {
        this(shade, type, washable);
        this.intensity = intensity;
    }
    
    public Color(String shade, String type, boolean washable, int intensity, String origin) {
        this(shade, type, washable, intensity);
        this.origin = origin;
    }
    
    public Color(String shade, String type, boolean washable, int intensity, String origin, float weight) {
        this(shade, type, washable, intensity, origin);
        this.weight = weight;
    }
    
    void display() {
        System.out.println("Shade: " + shade);
        System.out.println("Type: " + type);
        System.out.println("Washable: " + washable);
        System.out.println("Intensity: " + intensity);
        System.out.println("Origin: " + origin);
        System.out.println("Weight: " + weight);
        System.out.println("============================");
    }
}