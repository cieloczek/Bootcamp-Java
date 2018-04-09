package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MaxSubString {
    public static void main(String[] args) {
        List<Integer> abc = new ArrayList<>(4);
        for (int i = 0; i <6; i++) {
            abc.add(ThreadLocalRandom.current().nextInt(-2, 20));
        }
        System.out.println(abc);
        System.out.println(abc.toString());
        System.out.println(Arrays.asList(abc));
        System.out.println(Arrays.asList(abc).toString());

        max(abc);
    }


    private static String max(List<Integer> input){

        int maxSum = 0;

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            int sum =  0;
            List<Integer> tmpArr = new ArrayList<>();
            for (int j = i; j < input.size(); j++) {
                sum+=input.get(j);
                tmpArr.add(input.get(j));
            if(sum>=maxSum) {
                maxSum = sum;
                results = new ArrayList<>(tmpArr);
            }
                System.out.println(results);
            }
        }
        System.out.println(input);
        System.out.println("rrr   "+results);

    return null;}
}
