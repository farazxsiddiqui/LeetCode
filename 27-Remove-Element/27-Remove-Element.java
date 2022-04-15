class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]=999999;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length-count;
    }
}
