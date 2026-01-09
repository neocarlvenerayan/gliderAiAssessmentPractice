#include <iostream>
#include <string>

/*
 Problem:
 Reverse a string in place.

 Example:
 Input: "hello"
 Output: "olleh"

 Approach:
 1. Use two pointers: one at the beginning, one at the end.
 2. Swap characters until the pointers meet.

 Why this problem:
 - Tests array/string manipulation
 - Shows in-place modification
 - Highlights C++ low-level control

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

void reverseString(std::string& s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        std::swap(s[left], s[right]);
        left++;
        right--;
    }
}

int main() {
    std::string str1 = "hello";
    std::string str2 = "glider";

    reverseString(str1);
    reverseString(str2);

    std::cout << "Reversed str1: " << str1 << std::endl;
    std::cout << "Reversed str2: " << str2 << std::endl;

    return 0;
}