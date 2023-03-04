package Strings;


public class ReverseString {
    public static void main(String[] args) {
        String s = "This is to be reversed";
        char[] chars = s.toCharArray();
        char [] newChars = new char[s.length()];
        int l = s.length();
        for (int i = l; i > 0; i--) {
            newChars[s.length()-i] = chars[i-1];
        }

        for (int i = 0; i < l; i++) {
            System.out.print(newChars [i]);
        }
    }
}
