package Strings;


public class ReverseString {
    public static void main(String[] args) {
        String s = "This is to be reversed";
        char[] chars = s.toCharArray();
        char[] newChars = new char[s.length()];
        int l = s.length();
        for (int i = l; i > 0; i--) {
            newChars[s.length() - i] = chars[i - 1];
        }

        for (int i = 0; i < l; i++) {
            System.out.print(newChars[i]);
        }

        System.out.println();
        // simpler

        String m = "madam";  //since we are not sure wich will be the reversed - so we attach the reversed to another string rev
        String rev = "";
        for (int i = m.length()-1; i >= 0; i--) {
            rev = rev + m.charAt(i);   //finds a char at an index
        }
        System.out.println(rev);

    }
}
