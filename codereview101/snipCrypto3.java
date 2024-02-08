public class BadCreditCardHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your credit card number: ");
        String creditCardNumber = scanner.nextLine();
        System.out.println("Credit card number: " + creditCardNumber);
    }
}
