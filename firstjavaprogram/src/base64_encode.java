import java.util.Base64;
public class base64_encode {
    public static void main(String[] args) {
        String originalData = "hello world";

        byte[] originalBytes = originalData.getBytes();

        String encodedData = Base64.getEncoder().encodeToString(originalBytes);
        System.out.println("encoded: " + encodedData);
    }
}
