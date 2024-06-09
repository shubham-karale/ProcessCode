# Revision Que 1 to 5

### Qu1 - Two Sum Logic
 - Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 - You may assume that each input would have exactly one solution, and you may not use the same element twice.
 - Example:
   - Given nums = [2, 7, 11, 15], target = 9,
   - Because nums[0] + nums[1] = 2 + 7 = 9,
   - return [0, 1].
 - ** Main Logic **
    * Sort the array
    * Create left and right pointers -> left = 0, right = len(nums) - 1
    * While left < right
        * If nums[left] + nums[right] == target, return [left, right]
        * If nums[left] + nums[right] < target, increment left
        * If nums[left] + nums[right] > target, decrement right
 

### Qu 2 Maximum Sub Arrays Sum
   - Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
   - Example:
     - Input: [-2,1,-3,4,-1,2,1,-5,4],
     - Output: 6
     - Explanation: [4,-1,2,1] has the largest sum = 6.
   
  - ** Main Logic **
    * Initialize max_sum = nums[0], current_sum = nums[0]
    * Iterate through the array from 1 to len(nums)
        * current_sum = max(nums[i], current_sum + nums[i])
        * max_sum = max(max_sum, current_sum)
    * Return max_sum


### Qu 3 - Majority Elements
 - Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 - You may assume that the array is non-empty and the majority element always exist in the array.
 - Example:
   - Input: [3,2,3]
   - Output: 3
   - Input: [2,2,1,1,1,2,2]
   - Output: 2
   -  ** Main Logic **
        * We use Moores Voting Algorithm
        * Initialize count = 0, candidate = None
        * Iterate through the array
            * If count == 0, set candidate = nums[i]
            * If candidate == nums[i], increment count
            * Else decrement count
            * Return candidate
 

### Qu 4 - Buy Stock And Sell Stock
    - Say you have an array for which the ith element is the price of a given stock on day i.
    - If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
    - Note that you cannot sell a stock before you buy one.
    - Example:
      - Input: [7,1,5,3,6,4]
      - Output: 5
      - Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
      - Not 7-1 = 6, as selling price needs to be larger than buying price.

 - **Main Logic **
    * Initialize min_price = float('inf'), max_profit = 0
    * Iterate through the array
        * If nums[i] < min_price, set min_price = nums[i]
        * If nums[i] - min_price > max_profit, set max_profit = nums[i] - min_price
    * Return max_profit
   
### Qu 5 - Rotate Array
    - Given an array, rotate the array to the right by k steps, where k is non-negative.
    - Example:
      - Input: [1,2,3,4,5,6,7] and k = 3
      - Output: [5,6,7,1,2,3,4]
      - Explanation:
        - rotate 1 steps to the right: [7,1,2,3,4,5,6]
        - rotate 2 steps to the right: [6,7,1,2,3,4,5]
        - rotate 3 steps to the right: [5,6,7,1,2,3,4]

    - **Main Logic **
        * Reverse the entire array
        * Reverse the first k elements
        * Reverse the remaining elements
        * Return the array

### Qu 6 - Alternate Numbers
    - Given an array of integers, rearrange the array such that the first set of numbers are positive and the next set of numbers are negative.
    - Example:
      - Input: [1, 2, 3, -1, -2, -3]
      - Output: [1, -1, 2, -2, 3, -3]
    - **Main Logic **
        * Initialize left = 0, right = len(nums) - 1
        * While left < right
            * If nums[left] < 0 and nums[right] > 0, swap the elements
            * If nums[left] > 0, increment left
            * If nums[right] < 0, decrement right
        * Return the array
  ```cpp
    void alternateNumbers(vector<int>& nums) {
        int left = 0, right = nums.size() - 1;
        while (left < right) {
            if (nums[left] < 0 && nums[right] > 0) {
                swap(nums[left], nums[right]);
            }
            if (nums[left] > 0) {
                left++;
            }
            if (nums[right] < 0) {
                right--;
            }
        }
   
  ```