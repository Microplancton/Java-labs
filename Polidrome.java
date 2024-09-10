public class Polidrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPolidrome(s)) {
                System.out.println(s + " is a polidrome");
            } else {
                System.out.println(s + " is not a polidrome");
            }
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