public class CryptographyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        String hashedPassword = hashPassword(password);
        System.out.println("Hashed password (SHA-256): " + hashedPassword);
    }
}
