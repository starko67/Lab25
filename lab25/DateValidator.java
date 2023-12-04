package lab25;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class DateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy: ");
        String inputDate = scanner.nextLine();

        if (isValidDate(inputDate)) {
            System.out.println("Введенная дата - правильная дата.");
        } else {
            System.out.println("Введенная дата - неправильная дата.");
        }
    }

    public static boolean isValidDate(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        if (!matcher.matches()) {
            return false; // Не соответствует формату
        }

        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year < 1900 || year > 9999) {
            return false; // Год вне диапазона
        }

        if (month < 1 || month > 12) {
            return false; // Некорректный месяц
        }

        int maxDaysInMonth = (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) ? 29 : 28;
        if (day < 1 || day > maxDaysInMonth) {
            return false; // Некорректный день
        }

        return true;
    }
}