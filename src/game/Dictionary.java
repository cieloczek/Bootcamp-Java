package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private final List<String> words = new ArrayList<>();

    public Dictionary() {
//        Scanner scan = new Scanner(getClass().getClassLoader().getResourceAsStream("slowa.txt"));
////        while (scan.hasNextLine()) {
////            words.add(scan.nextLine());
////        }
        words.add("klebuszek");
        words.add("jajko");
        words.add("wielkanoc");
    }

    public List<String> getWords() {
        return words;
    }
}
