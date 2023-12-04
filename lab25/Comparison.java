package lab25;
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String invalidString1 = scanner.next();
        System.out.println(isValidString(invalidString1)); // Должно вернуть false
    }
    public static boolean isValidString(String input) {
        String pattern = "abcdefghijklmnopqrstuv18340";
        return input.matches(pattern);
    }
}

