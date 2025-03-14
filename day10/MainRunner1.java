public class MainRunner1 {
    public static void main(String[] args) {
        Festival f1 = new Festival("Diwali", "November", "India");
        Festival f2 = new Festival("Christmas", "December", "USA");
        Festival f3 = new Festival("Eid", "April", "UAE");
        Festival f4 = new Festival("Holi", "March", "India");
        Festival f5 = new Festival("Thanksgiving", "November", "Canada");

        Chat c1 = new Chat("Alice", "Bob", "Hello!");
        Chat c2 = new Chat("Charlie", "David", "How are you?");
        Chat c3 = new Chat("Eve", "Frank", "Good morning");
        Chat c4 = new Chat("Grace", "Hank", "See you soon");
        Chat c5 = new Chat("Ivy", "Jack", "Take care");

        Charger ch1 = new Charger("Samsung", 25, "Type-C");
        Charger ch2 = new Charger("Apple", 20, "Lightning");
        Charger ch3 = new Charger("Anker", 30, "USB-A");
        Charger ch4 = new Charger("Sony", 15, "Micro-USB");
        Charger ch5 = new Charger("Xiaomi", 33, "Type-C");

        System.out.println(f1.name + " - " + f1.date + " - " + f1.country);
        System.out.println(f2.name + " - " + f2.date + " - " + f2.country);
        System.out.println(f3.name + " - " + f3.date + " - " + f3.country);
        System.out.println(f4.name + " - " + f4.date + " - " + f4.country);
        System.out.println(f5.name + " - " + f5.date + " - " + f5.country);
        
        System.out.println(c1.sender + " -> " + c1.receiver + ": " + c1.message);
        System.out.println(c2.sender + " -> " + c2.receiver + ": " + c2.message);
        System.out.println(c3.sender + " -> " + c3.receiver + ": " + c3.message);
        System.out.println(c4.sender + " -> " + c4.receiver + ": " + c4.message);
        System.out.println(c5.sender + " -> " + c5.receiver + ": " + c5.message);
        
        System.out.println(ch1.brand + " - " + ch1.power + "W - " + ch1.type);
        System.out.println(ch2.brand + " - " + ch2.power + "W - " + ch2.type);
        System.out.println(ch3.brand + " - " + ch3.power + "W - " + ch3.type);
        System.out.println(ch4.brand + " - " + ch4.power + "W - " + ch4.type);
        System.out.println(ch5.brand + " - " + ch5.power + "W - " + ch5.type);
    }
}