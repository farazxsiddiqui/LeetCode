class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0,max = nums[0];
        for(int ele : nums)
        {
            sum = sum + ele;
            max = Math.max(sum,max);
            if(sum < 0)
            {
               sum = 0; 
            }
        }
        return max;  
    }
}
