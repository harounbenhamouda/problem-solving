package algo;

public class ValidSubsequenceProblem {
    public static boolean validSubsequence(String ch, String ch2) {
        int j = 0; // chainr twila
        int i = 0; // chaine 9sir;
        while (i < ch.length() && j < ch2.length()) {
            if (ch.charAt(i) == ch2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == ch.length();
    }

    public static void main(String[] args) {
        String ch = "acf";
        String ch2 = "abcde";
        boolean result = validSubsequence(ch, ch2);
        if (result) {
            System.out.println("It's valid");
        } else {
            System.out.println("It's not valid");
        }
    }
}
