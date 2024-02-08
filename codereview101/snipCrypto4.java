public class CreditCardEncryptionExample {
    public static void main(String[] args) throws Exception {

        String key = "MySecretKey123456";
        String creditCardNumber = "1234567890123456";

        String encryptedData = encryptData(creditCardNumber, key);
        System.out.println("Encrypted data: " + encryptedData);

        String decryptedData = decryptData(encryptedData, key);
        System.out.println("Decrypted data: " + decryptedData);
    }
}
