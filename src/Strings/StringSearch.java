package Strings;

public class StringSearch {
    public static void main(String[] args) {
        // three basic methods of String class uswd in tests assertions: charAt(), indexOf(), substring(index)
        String str = "Payment og $ 100 is necessary";
        int index = str.indexOf("$");
        System.out.println(index);
        System.out.println(str.charAt(index));
        System.out.println(str.substring(index, index + 5));

    }
}
