package Strings;

public class Pangram {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";

        inputString = inputString.toLowerCase();

        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                isPresent[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean present : isPresent) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}

