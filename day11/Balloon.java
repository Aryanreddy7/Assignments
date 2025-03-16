class Balloon { 
    String color;  
    int size;  
    String material;  
    float pressure;  
    char grade;
    boolean floating; 

    public Balloon() {
        System.out.println("Running Balloon:");
    }

    public Balloon(String color) {     
        this.color = color;
    }

    public Balloon(String color, int size) {
        this(color);
        this.size = size;
    }

    public Balloon(String color, int size, String material) {
        this(color, size);
        this.material = material;
    }

    public Balloon(String color, int size, String material, float pressure) {
        this(color, size, material);
        this.pressure = pressure;
    }

    public Balloon(String color, int size, String material, float pressure, char grade) {
        this(color, size, material, pressure);
        this.grade = grade;
    }

    public Balloon(String color, int size, String material, float pressure, char grade, boolean floating) {
        this(color, size, material, pressure, grade);
        this.floating = floating;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Pressure: " + pressure);
        System.out.println("Grade: " + grade);
        System.out.println("Floating: " + floating);
        System.out.println("============================");
    }
}