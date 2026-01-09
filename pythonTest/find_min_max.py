"""
Problem:
Given a list of integers, find both the minimum and maximum values
using a single pass through the list.

Example:
Input: [3, 1, 7, 2, 9]
Output: (1, 9)

Approach:
1. Initialize min and max using the first element.
2. Traverse the list once, updating min and max as needed.

Why this problem:
- Tests loop control
- Tests conditional logic
- Shows efficiency awareness (single pass)

Time Complexity: O(n)
Space Complexity: O(1)
"""

def find_min_max(numbers):
    # Edge case: empty list
    if not numbers:
        return None

    # Initialize min and max to the first element
    min_value = numbers[0]
    max_value = numbers[0]

    # Traverse the list once
    for num in numbers:
        if num < min_value:
            min_value = num
        elif num > max_value:
            max_value = num

    return min_value, max_value


# Simple test cases
if __name__ == "__main__":
    print(find_min_max([3, 1, 7, 2, 9]))   # Expected: (1, 9)
    print(find_min_max([5]))              # Expected: (5, 5)
    print(find_min_max([-3, -1, -7]))     # Expected: (-7, -1)
