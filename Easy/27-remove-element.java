// Problem: 27. Remove Elements
// Link: https://leetcode.com/problems/remove-element/
// Difficulty: Easy 
class removeelem{
    public int RemoveElement(int [] nums, int val){
        int k = 0;
        for(int i = 0 ; i< nums.length ; i++){
        if(nums[i] != val){
            nums[k] = nums[i];
            k++;
        }
    }
        return k;
    }
}