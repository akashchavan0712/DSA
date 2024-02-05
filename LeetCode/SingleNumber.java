package LeetCode;

import java.util.Scanner;

public class SingleNumber {

    public static int singleNumberInArray(int[] nums) {
        int singleDigit = 0;
        for (int num : nums) {
            singleDigit ^= num;
        }
        return singleDigit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6};
        int ans = singleNumberInArray(arr); // Call the method using the instance
        System.out.println("The answer is : "+ans);
        sc.close();
    }
}
