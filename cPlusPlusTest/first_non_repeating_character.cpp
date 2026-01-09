#include <iostream>
#include <unordered_map>
#include <string>

/*
 Problem:
 Given a string, find the first non-repeating character.
 If no such character exists, return '\0'.

 Example:
 Input: "aabbcdd"
 Output: c

 Approach:
 1. Count character frequency using an unordered_map.
 2. Traverse the string again and return the first character with count == 1.

 Why this problem:
 - Tests string handling
 - Tests hash maps
 - Common in coding assessments

 Time Complexity: O(n)
 Space Complexity: O(n)
*/

char firstNonRepeatingChar(const std::string& s) {
    if (s.empty()) {
        return '\0';
    }

    std::unordered_map<char, int> frequency;

    // First pass: count frequency
    for (char c : s) {
        frequency[c]++;
    }

    // Second pass: find first non-repeating character
    for (char c : s) {
        if (frequency[c] == 1) {
            return c;
        }
    }

    return '\0'; // No non-repeating character found
}

int main() {
    std::string input1 = "aabbcdd";
    std::string input2 = "aabb";
    std::string input3 = "swiss";

    char result1 = firstNonRepeatingChar(input1);
    char result2 = firstNonRepeatingChar(input2);
    char result3 = firstNonRepeatingChar(input3);

    std::cout << "Result 1: " << (result1 ? result1 : '-') << std::endl;
    std::cout << "Result 2: " << (result2 ? result2 : '-') << std::endl;
    std::cout << "Result 3: " << (result3 ? result3 : '-') << std::endl;

    return 0;
}
