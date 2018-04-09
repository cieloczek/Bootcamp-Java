package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorseCode {
    //MorseCode.decode(".... . -.--   .--- ..- -.. .")
    // "HEY JUDE"
    //MorseCode.encode("HEY JUDE")
    // ".... . -.--   .--- ..- -.. ."
    private static char[] signs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};
    static Map<Character,String> code = new HashMap<>();
    public static void main(String[] args) {
        for (int i = 0; i <signs.length ; i++) {
            code.put(signs[i],morse[i]);
        }
        System.out.println(encode("Twoj Stary", code));
        System.out.println(decode("-..,---,--",code));
    }

    public static String encode(String input, Map<Character, String> code) {

        char[] temp = input.toLowerCase().toCharArray();
        String animal;
        String result="";
        for (int i = 0; i < temp.length; i++) {
           animal = code.get(temp[i]);
           result+=animal;
           result+=",";
        }
        return result;
    }

    public static String decode(String input, Map<Character, String> code) {
        StringBuilder sb = new StringBuilder();
        String[] table = input.split(",");
        for (int i = 0; i < table.length; i++) {
        for(Map.Entry<Character, String> entry : code.entrySet()){
            if(entry.getValue().equals(table[i])){
               sb.append(entry.getKey());
            }
        }
        }

        return sb.toString();
    }
}
