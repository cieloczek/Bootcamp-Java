package Sorting;

import java.io.StringWriter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String command = input[0].toLowerCase();
        List<Integer> list = new ArrayList<>();
        boolean app = true;

            printOptions();
            int val = Integer.parseInt(input[1]);
            switch (action(command)) {
                case "add":
                    addition(list, val);
                    break;
                case "show":
                    show(list);
                    break;
                case "remove":
                    remove(list, val);
                    break;
                case "generate":
                    generate(list, val);
                    break;
                case "sort":
                    sort(list);
                    break;
                case "quit":
                    app = false;
                    break;

        }
    }

    private static void generate(List<Integer> list, int val) {
        for (int i = 0; i <val ; i++) {
            list.add(ThreadLocalRandom.current().nextInt(100));
        }
    }

    private static void show(List<Integer> list) {
        System.out.println(list);
    }

    private static void remove(List<Integer> list, int x) {
        for (int i = 0; i<x; i++) {
            if(list.size()>0) {
                list.remove(list.size() - 1);
            }
            else{
                System.out.println("List is empty");
            }
        }
    }

    private static void printOptions(){
        System.out.println("What do you want to do ? ");

    }
    private static String action(String input){
        String x = "";
        Map<String, String> options =new HashMap<>();
        options.put("add", "add, addition, adding, sum");
        options.put("multiply", "multiply");
        options.put("remove", "remove, delete, erease");
        options.put("show", "show, list");
        options.put("exit", "exit, quit");
        options.put("sort", "sort orded");
        options.put("generate", "generate, new,randomize,random");
      Set<String> abc = new HashSet<>();
        abc = options.entrySet().stream().filter( entry -> entry.getValue().contains(input)).map(Map.Entry::getKey).collect(Collectors.toSet());
        String temp = abc.toString();
//        for(Map.Entry<String, String> entry : options.entrySet()){
//            if(entry.getValue().contains(input)){
//                 x = entry.getKey();
//                System.out.println(x);
//                 break;
//            }else{
//                System.out.println("I dont understand this command");
//                 x = "0";
//                 break;
//            }
        System.out.println(temp);
    return temp;
    }

    private static void addition(List<Integer> list,int x){
        list.add(x);
        System.out.println(x + " has been added to the list");
    }
    private static void sort(List<Integer> list){
        for (int i = 1; i <list.size() ; i++) {
            int temp = list.get(i);
            for (int j = i; j > 0 ; j--) {
                if(list.get(j)<list.get(j-1)){
                    int val = list.get(j-1);
                    list.set(j-1, list.get(j));
                   list.set(j, val);
                }

            }

        }
    }

}
