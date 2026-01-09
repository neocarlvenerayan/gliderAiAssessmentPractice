"""
Problem:
Given a string, find the first non-repeating character.
If no such character exists, return None.

Example:
Input: "aabbcdd"
Output: "c"

Approach:
1. Count the frequency of each character using a dictionary.
2. Traverse the string again and return the first character with count == 1.

Why this problem:
- Tests string handling
- Tests dictionary usage
- Very common in coding assessments

Time Complexity: O(n)
Space Complexity: O(n)
"""

def first_non_repeating_char(s):
    # Edge case: empty or None input
    if not s:
        return None

    frequency = {}

    # First pass: count frequency of each character
    for char in s:
        frequency[char] = frequency.get(char, 0) + 1

    # Second pass: find first character that appears once
    for char in s:
        if frequency[char] == 1:
            return char

    # If no non-repeating character exists
    return None


# Simple test cases
if __name__ == "__main__":
    print(first_non_repeating_char("aabbcdd"))  # Expected: c
    print(first_non_repeating_char("aabb"))     # Expected: None
    print(first_non_repeating_char("swiss"))    # Expected: w
