package Exercises;
import org.assertj.core.api.Assertions;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextBiggerNumberSameDigits {
    public static void main(String[] args) {
        
            Assertions.assertThat(nextBiggerNumber(12)).isEqualTo(21);
            Assertions.assertThat(nextBiggerNumber(513)).isEqualTo(531);
            Assertions.assertThat(nextBiggerNumber(2017)).isEqualTo(2071);
            Assertions.assertThat(nextBiggerNumber(9)).isEqualTo(-1);
            Assertions.assertThat(nextBiggerNumber(111)).isEqualTo(-1);
            Assertions.assertThat(nextBiggerNumber(531)).isEqualTo(-1);

    }

    private static int nextBiggerNumber(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        char[] sortedArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int temp = chars.length-i-1;
            sortedArray[i] = chars[temp];
        }
    int b = Integer.parseInt(String.valueOf(sortedArray));

        System.out.println(sortedArray);
        return b;

    }

}