package hw4;

import java.util.Arrays;
import java.util.Iterator;

public class Arrays05 {
    public static void main(String[] args) {
        int[] nums = {4, -1, -5, 10, 12, -6, -8, 0};

        int count = 0;
        for (int num : nums) if (num < 0) count++;

        int[] negativeNums = new int[count];

        int j = 0;
        for (int num : nums) {
            if (num < 0) {
                negativeNums[j] = num;
                j++;
            }
        }

        System.out.println(Arrays.toString(negativeNums));
    }
}
