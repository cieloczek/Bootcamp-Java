package Exercises.BlockJVM;

import java.util.List;

import static Exercises.BlockJVM.FileHelper.readAllLines;

public class Program {
    public static void main(String[] args) {
        List<String> read = readAllLines("/Users/mateusz/IdeaProjects/Class/src/Exercises/BlockJVM/LoremIpsum");

        String result = StringHelper.concatenateWithStringBuilder(read);
        System.out.println(result);
    }
}
