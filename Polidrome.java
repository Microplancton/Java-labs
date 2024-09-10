import java.util.Scanner;

public class Polidrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект сканера
        System.out.print("Введите строку: ");
        String text = scanner.nextLine(); // Считываем строку с клавиатуры
        if (isPolidrome(text)) {
            System.out.println(text + " is a polidrome");
        } else {
            System.out.println(text + " is not a polidrome");
        }
    }
    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public static boolean isPolidrome(String s) {
        return s.equals(reverseString(s));
    }
}