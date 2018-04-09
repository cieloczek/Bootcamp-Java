package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalNames {
    /*
    Give you some ```chars```, and they can combine many animal names.
    Return the maximum number of animal names that can be combined by chars.
    Animal names have been preload by variable ```names```
    One char can not use twice, for example:
    chars="goatcode"
    When you got a "dog" first time, chars left "atcoe",
    second time you can got a "cat".
    result=2
    When you got a "goat" first time, chars left "code",
    no animals will be found at next time.
    result=1
    So we should return the maximum number, sc("goatcode")=2
     */
    private static String[] animalNames = {"dog", "cat", "bat", "cock", "cow", "pig", "fox",
            "ant", "bird", "lion", "wolf", "deer", "bear", "frog",
            "hen", "mole", "duck", "goat"};

    public static void main(String[] args) {
//        sc("dogcat")=2("dog" and "cat")
   //     sc("bcaatt");//=2("bat" and "cat")
//
 //     sc("dogdog");//=2("dog" and "dog")
//        sc("dopig")=1(only contains one of "dog" or "pig")
   //     sc("goatcode");//=2  should return 2("dog","cat"), not 1("goat")
        sc("cockdogwdufrbir");//=4  should return 4("cow","duck","frog","bird") not 2("cock" and "dog")
    }

    public static void sc(String string) {
        List<Character> collect = new ArrayList<>(toList(string));
        boolean delete = false;
        List<Character> deleted = new ArrayList<>();
        List<String> delString = new ArrayList<>();

        for (int i = 0; i < animalNames.length; i++) {
            StringBuilder sb = new StringBuilder();
            delete = false;
            List<Character> tmp = new ArrayList<>(toList(animalNames[i]));
                for (int j = 0; j < tmp.size(); j++) {
                    if (!collect.contains(tmp.get(j))) {
                        delete = false;
                        break;
                    } else {
                        delete = true;
                    }
                }
            if (delete) {
                System.out.println("Deleted " + animalNames[i]);
                for (int j = 0; j < tmp.size(); j++) {
                    sb.append(tmp.get(j));
                  deleted.add(tmp.get(j));
                }delString.add(sb.toString());
            }
            if(collect.size()==0){
                System.out.println(deleted);
                break;
            }
            System.out.println(delString)
            ;
        }
    }
    private static List<Character> toList(String string){
        return string.chars().mapToObj(value -> Character.valueOf((char) value)).collect(Collectors.toList());
    }

}










