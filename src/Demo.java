import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Demo {
        public static String encode(String text) {
            return URLEncoder.encode(text, StandardCharsets.UTF_8);
        }
        public static String decode(String encodedText) {
            return URLDecoder.decode(encodedText, StandardCharsets.UTF_8);
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("URL kodlash va dekodlash dasturi");
        System.out.println("1. Matnni URL formatida kodlash");
        System.out.println("2. URL formatdagi matnni dekodlash");
        System.out.print("Tanlovni kiriting (1 yoki 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Bufferni tozalash

        if (choice == 1) {
            System.out.print("Kodlash uchun matnni kiriting: ");
            String text = scanner.nextLine();
            String encodedText = encode(text);
            System.out.println("URL formatida kodlangan matn: " + encodedText);
        } else if (choice == 2) {
            System.out.print("Dekodlash uchun URL matnni kiriting: ");
            String encodedText = scanner.nextLine();
            try {
                String decodedText = decode(encodedText);
                System.out.println("Dekodlangan matn: " + decodedText);
            } catch (IllegalArgumentException e) {
                System.out.println("Xato: Yaroqli URL formatdagi matn kiriting!");
            }
        } else {
            System.out.println("Noto'g'ri tanlov!");
        }

        scanner.close();
    }
}