class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length%2==0)
        {
            return nums[nums.length/2];
        }
        else
            return nums[((nums.length+1)/2)-1]; 
    }
}
