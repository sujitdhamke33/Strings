package Strings;

public class SecondLastString {
    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date"};
        if (stringArray.length >= 2) {
            String secondLastString = stringArray[stringArray.length - 2];
            System.out.println("Second Last String: " + secondLastString);
        } else {
            System.out.println("Array does not have enough elements.");
        }
    }
}
