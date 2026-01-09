import java.util.ArrayList;
import java.util.List;

/*
 Problem:
 Given an integer array and a window size K,
 return a smoothed array where each element is the average
 of the last K elements.

 If K <= 0 or K > array size, return a list containing -1.

 Example:
 Input: arr = [1, 1, 1, 2, 1, 1, 1], K = 3
 Output: [1.00, 1.00, 1.33, 1.33, 1.33]

 Approach:
 - Use a sliding window
 - Maintain a running sum
 - Subtract the element leaving the window
 - Add the element entering the window

 Time Complexity: O(n)
 Space Complexity: O(1) extra space
*/

public class SmoothData {

    public static List<Float> smoothData(List<Integer> arr, int K) {
        List<Float> result = new ArrayList<>();

        // Edge cases
        if (arr == null || arr.isEmpty() || K <= 0 || K > arr.size()) {
            result.add(-1.0f);
            return result;
        }

        float windowSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            windowSum += arr.get(i);

            // Remove element leaving the window
            if (i >= K) {
                windowSum -= arr.get(i - K);
            }

            // Add average once window size is reached
            if (i >= K - 1) {
                result.add(windowSum / K);
            }
        }

        return result;
    }

    // Simple test
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 1, 1, 2, 1, 1, 1);
        int K = 3;

        System.out.println(smoothData(data, K));
    }
}
