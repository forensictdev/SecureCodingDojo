public class UserLogin {
    public static void main(String[] args) {
        try {
            String username = "myuser";
            String password = "mypassword";
            String apiUrl = "https://example.com/login"; // Login URL
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String userData = "username=" + username + "&password=" + password;
            
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = userData.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
            // Perform the login request securely
            // ...
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
