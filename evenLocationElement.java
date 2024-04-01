package Strings;

public class evenLocationElement {
    public static void main(String[] args) {
        String [] array = {"sujit","ram","babu","Shubham","monali"};
        for (int i = 0; i < array.length; i+=2) {
            System.out.println(array[i]);
        }
    }
}
