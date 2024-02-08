public class PasswordEncryption {
    public static void main(String[] args) throws Exception {
        String username = "user123";
        String password = "mySecurePassword";
        String key = "SecretKey12345678";
        String iv = "SecretIV123456789";

        String encryptedPassword = encryptPassword(password, key, iv);
        System.out.println("Encrypted password: " + encryptedPassword);
    }

    public static String encryptPassword(String password, String key, String iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes("UTF-8"));

        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);

        byte[] encryptedPasswordBytes = cipher.doFinal(password.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encryptedPasswordBytes);
    }
}
