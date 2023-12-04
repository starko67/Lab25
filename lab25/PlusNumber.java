package lab25;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlusNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(hasDigitsWithoutPlus(text)); // Должно вернуть false
    }
    public static boolean hasDigitsWithoutPlus(String text) {
        Pattern pattern = Pattern.compile("\\d(?!\\+)");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
