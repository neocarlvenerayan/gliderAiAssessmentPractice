import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/*
 Problem:
 Given an array of integers and a target value,
 return the indices of the two numbers that add up to the target.

 Assumption:
 - Exactly one solution exists.
 - The same element cannot be used twice.

 Example:
 Input: nums = [2, 7, 11, 15], target = 9
 Output: [0, 1]

 Approach:
 1. Use a HashMap to store numbers and their indices.
 2. For each number, check if (target - current number) exists in the map.

 Time Complexity: O(n)
 Space Complexity: O(n)
*/

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        // If no solution exists (should not happen based on assumptions)
        return new int[]{ -1, -1 };
    }

    // Simple test cases
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums1, 9))); // [0, 1]

        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums2, 6))); // [1, 2]
    }
}
