import java.util.Base64;
public class base64_decode {
    public static void main(String[] args) {
        String encodedData = "aGVsbG8gd29ybGQ=";
        byte[] decodedBytes= Base64.getDecoder().decode(encodedData);
        String decodedData = new String(decodedBytes);
        System.out.println("decoded: " + decodedData );
    }

}
