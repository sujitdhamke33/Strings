package Strings;

import java.util.List;
import java.util.stream.Collectors;

public class EvenlengthString {
    public static void main(String[] args) {
        List<String> st1 = List.of("sujit", "mane", "shubham", "Vedant");
        List<String> evenstrings = st1.stream().filter(i -> i.length() % 2 == 0).collect(Collectors.toList());
        System.out.println(evenstrings);
    }
}
