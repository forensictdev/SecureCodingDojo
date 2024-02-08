public class PasswordHashing {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String username = "user123";
        String password = "mySecurePassword";

        String hashedPassword = hashPassword(password);

        System.out.println("Password hash: " + hashedPassword);
    }

    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] bytes = md.digest(password.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
