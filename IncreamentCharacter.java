package Strings;

public class IncreamentCharacter {
    public static void main(String[] args) {
        char originalChar = 'A';
        char incrementedChar = incrementChar(originalChar);
        System.out.println("Original Character: " + originalChar);
        System.out.println("Incremented Character: " + incrementedChar);
    }

    public static char incrementChar(char c) {
        if (c >= 'A' && c < 'Z') {
            return (char) (c + 1);
        } else {
            return 'A';
        }
    }
}
