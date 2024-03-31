package Strings;

public class vowelsInstring {
    public static void main(String[] args) {
       int count = 0;
        String vowel = "SujitDhamke";
        for (int i = 0; i < vowel.length(); i++) {
            count++;
            char ch = vowel.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print(ch + " ");
            }
        }
        System.out.println("String length : " + count);
    }
}
