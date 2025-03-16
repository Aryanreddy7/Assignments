class Water {
    String source;
    String type;
    float pHLevel;
    boolean purified;
    String packaging;
    int volume;
    
    public Water() {
        System.out.println("Running Water:");
    }
    
    public Water(String source) {
        this.source = source;
    }
    
    public Water(String source, String type) {
        this(source);
        this.type = type;
    }
    
    public Water(String source, String type, float pHLevel) {
        this(source, type);
        this.pHLevel = pHLevel;
    }
    
    public Water(String source, String type, float pHLevel, boolean purified) {
        this(source, type, pHLevel);
        this.purified = purified;
    }
    
    public Water(String source, String type, float pHLevel, boolean purified, String packaging) {
        this(source, type, pHLevel, purified);
        this.packaging = packaging;
    }
    
    public Water(String source, String type, float pHLevel, boolean purified, String packaging, int volume) {
        this(source, type, pHLevel, purified, packaging);
        this.volume = volume;
    }
    
    void display() {
        System.out.println("Source: " + source);
        System.out.println("Type: " + type);
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Purified: " + purified);
        System.out.println("Packaging: " + packaging);
        System.out.println("Volume: " + volume);
        System.out.println("============================");
    }
}