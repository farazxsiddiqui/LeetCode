class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                even++;
                nums[i]=nums[i]/10;   
            }
            if(even%2==0)
            {
                count++;
            }
            even = 0;
        }
        return count;   
    }
}
