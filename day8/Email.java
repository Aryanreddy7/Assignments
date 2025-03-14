class Email {
    public static void GiveEmail(String[] Email) {
        for (String mail : Email) {
            System.out.println(mail);
        }
    }

    public static void main(String[] args) { 
        String[] mail = {"aryan@gmail.com", "surya@gmail.com", "reddy@gmail.com"};
        GiveEmail(mail); 
    }
}