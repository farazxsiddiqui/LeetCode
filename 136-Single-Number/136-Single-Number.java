class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }
        int i=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
                
            } 
            else if(nums[i]==nums[i+1])
            {
              i++;  
            }    
            
        }
        if((nums.length%2)!=0&&nums[i]==nums[nums.length-1])
        {
            return nums[nums.length-1];
        }
        return 0;
    }
}
