package Arrays;

public class Qu12_RemoveElement_27 {
    static int removeElement(int[]nums,int val){
        // Create Count Variable
        int count = 0;
        // Iterate Over the Loop
        for(int i = 0;i<nums.length;i++){
            // If the element is not equal to val
            if(nums[i]!=val){
                // Assign the element to the count
                nums[count] = nums[i];
                // Increment the count
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Remove Element");
        int [] nums = {3,2,2,3};
        int [] nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;
        int val = 3;
        System.out.println(removeElement(nums, val)); // 2
        System.out.println(removeElement(nums1, val1)); // 5
    }
}
