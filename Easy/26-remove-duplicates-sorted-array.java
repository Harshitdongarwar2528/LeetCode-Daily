// Problem: 26. Remove Duplicates From Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy 

package Easy;                               
class Sorted {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ) return 0;
        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {

                slow++;
                
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}