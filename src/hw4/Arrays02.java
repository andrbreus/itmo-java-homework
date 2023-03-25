package hw4;

public class Arrays02 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 1; i <= 10; i++) nums[i - 1] = i * 2;

        for (int i = 9; i >= 0; i--) System.out.println(nums[i]);
    }
}
