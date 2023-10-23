public class EX1{
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedStr = reverseString(inputString);
        System.out.println("Reversed String: " + reversedStr);
    }
}