class Bucket {
    String material;
    String color;
    int capacity;
    boolean handle;
    float height;
    String shape;
    
    public Bucket() {
        System.out.println("Running Bucket:");
    }
    
    public Bucket(String material) {
        this.material = material;
    }
    
    public Bucket(String material, String color) {
        this(material);
        this.color = color;
    }
    
    public Bucket(String material, String color, int capacity) {
        this(material, color);
        this.capacity = capacity;
    }
    
    public Bucket(String material, String color, int capacity, boolean handle) {
        this(material, color, capacity);
        this.handle = handle;
    }
    
    public Bucket(String material, String color, int capacity, boolean handle, float height) {
        this(material, color, capacity, handle);
        this.height = height;
    }
    
    public Bucket(String material, String color, int capacity, boolean handle, float height, String shape) {
        this(material, color, capacity, handle, height);
        this.shape = shape;
    }
    
    void display() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity);
        System.out.println("Handle: " + handle);
        System.out.println("Height: " + height);
        System.out.println("Shape: " + shape);
        System.out.println("============================");
    }
}