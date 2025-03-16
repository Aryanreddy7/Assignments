class Holi {
    String type;
    String festivalName;
    boolean organic;
    String region;
    int intensity;
    float duration;
    
    public Holi() {
        System.out.println("Running Holi:");
    }
    
    public Holi(String type) {
        this.type = type;
    }
    
    public Holi(String type, String festivalName) {
        this(type);
        this.festivalName = festivalName;
    }
    
    public Holi(String type, String festivalName, boolean organic) {
        this(type, festivalName);
        this.organic = organic;
    }
    
    public Holi(String type, String festivalName, boolean organic, String region) {
        this(type, festivalName, organic);
        this.region = region;
    }
    
    public Holi(String type, String festivalName, boolean organic, String region, int intensity) {
        this(type, festivalName, organic, region);
        this.intensity = intensity;
    }
    
    public Holi(String type, String festivalName, boolean organic, String region, int intensity, float duration) {
        this(type, festivalName, organic, region, intensity);
        this.duration = duration;
    }
    
    void display() {
        System.out.println("Type: " + type);
        System.out.println("Festival: " + festivalName);
        System.out.println("Organic: " + organic);
        System.out.println("Region: " + region);
        System.out.println("Intensity: " + intensity);
        System.out.println("Duration: " + duration);
        System.out.println("============================");
    }
}