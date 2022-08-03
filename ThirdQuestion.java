import java.util.ArrayList;

// Question 3:
// Given a sorted array of integers “nums” and an integer target, return indices for two numbers such 
// that they add up to the target.  You may assume that each input would have exactly one solution, and 
// you may not use the same element twice. You can return the answer in any order. 

public class ThirdQuestion {
    public static ArrayList<Integer> indicesOfSum(int[] nums, int target) {
        int i = 0, j = i + 1;
        ArrayList<Integer> a = new ArrayList<>();
        while (j < nums.length - 1) {
            if (nums[i] + nums[j] == target) {
                a.add(i);
                a.add(j);
                return a;
            } else {
                i++;
                j++;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 6 };
        int target = 8;
        ArrayList<Integer> result = indicesOfSum(nums, target);

        for (Integer integer : result) {
            System.out.println(integer);
        }

    }
}
