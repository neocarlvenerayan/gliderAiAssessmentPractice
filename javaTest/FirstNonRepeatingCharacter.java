import java.util.HashMap;
import java.util.Map;

/*
 Problem:
 Given a string, find the first non-repeating character.
 If no such character exists, return null.

 Example:
 Input: "aabbcdd"
 Output: c

 Approach:
 1. Count the frequency of each character using a HashMap.
 2. Traverse the string again and return the first character with count == 1.

 Time Complexity: O(n)
 Space Complexity: O(n)
*/

public class FirstNonRepeatingCharacter {

    public static Character firstNonRepeatingChar(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // First pass: count character frequency
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Second pass: find first non-repeating character
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        return null; // No non-repeating character found
    }

    // Simple test cases
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabbcdd")); // c
        System.out.println(firstNonRepeatingChar("aabb"));    // null
        System.out.println(firstNonRepeatingChar("swiss"));   // w
    }
}
