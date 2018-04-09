package Exercises.BlockJVM;

import java.util.List;

public class StringHelper {
    public static String concatenateAll(List<String> list){
        /**
         *
         * przyjmuje liste i konkatenuje do Stringa
         *
         **/
        String result = "";
        for(String elem : list){
            result+=elem;
        }return result;
    }
    public static String concatenateWithStringBuilder(List<String>strings){
        StringBuilder sb = new StringBuilder();
        for(String elem : strings){
            sb.append(elem).append("\n");
        }return sb.toString();
    }
}
