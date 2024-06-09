## Revision Qu 5 to 10

### Qu 6 - Largest Subsequence Of An Arrays
    - Given an array of integers, return the largest subsequence of the array.
    - Example:
      - Input: [1, 2, 3, 4, 5]
      - Output: [1, 2, 3, 4, 5]
      - Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
      - Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    - **Main Logic **
        * Initialize a variable to store the maximum subsequence
        * Iterate through the array
            * If the current element is greater than the previous element, add it to the subsequence
            * If the current subsequence is greater than the maximum subsequence, update the maximum subsequence
        * Return the maximum subsequence

### Qu 7 - Count All Sub Arrays With Sum
    - Given an array of integers, return the count of all subarrays whose sum is equal to a given target.
    - Example:
      - Input: [1, 1, 1], target = 2
      - Output: 2
      - Explanation: [1, 1], [1, 1]
    - Example:
      - Input: [1, 2, 3], target = 3
      - Output: 2
      - Explanation: [1, 2], [3]
     - **Main Logic **
          * Initialize a variable to store the count of subarrays
          * Iterate through the array
                * Initialize a variable to store the sum of the subarray
                * Iterate through the array from the current index
                 * Add the current element to the sum
                 * If the sum is equal to the target, increment the count
          * Return the count

