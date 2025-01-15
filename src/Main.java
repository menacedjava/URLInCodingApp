
public class Main {
    public static void main(String[] args) {
        public static String encode(String text) {
            return URLEncoder.encode(text, StandardCharsets.UTF_8);
        }
        public static String decode(String encodedText) {
            return URLDecoder.decode(encodedText, StandardCharsets.UTF_8);
        }
    }
}