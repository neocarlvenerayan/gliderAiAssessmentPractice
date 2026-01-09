public class CanConstructStrings {

    public static String solve(String S1, String S2, String R) {
        // Write your code here

        int[] frequency = new int[26];

        // Count frequency of characters in R
        for (char c : R.toCharArray()) {
            frequency[c - 'A']++;
        }

        // Check if S1 can be formed
        for (char c : S1.toCharArray()) {
            if (frequency[c - 'A'] > 0) {
                frequency[c - 'A']--;
            } else {
                return "No";
            }
        }

        // Check if S2 can be formed
        for (char c : S2.toCharArray()) {
            if (frequency[c - 'A'] > 0) {
                frequency[c - 'A']--;
            } else {
                return "No";
            }
        }

        // If both strings are successfully formed
        return "Yes";
    }
}
