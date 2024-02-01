public class Permissions {
    public static void main(String[] args) {
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            System.setProperty("java.security.policy", "allPermission.policy");
            return null;
        });

        try {
            Class.forName("com.example.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
