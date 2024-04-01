package Strings;

public class Pangram {
    public static void main(String[] args) {
          final int alphabet = 26;
        Set<Character> set = new HashSet<>();
       String st = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
            if(ch>='A' && ch<='Z'){
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
            
        }
        if(set.size()==alphabet){
            System.out.println("its a panagram string");
        }else{
            System.out.println("Its not panagram string");
        }
    }
}

