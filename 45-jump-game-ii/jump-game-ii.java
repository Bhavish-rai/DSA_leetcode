class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        int j=0;
        int c=0,f=0;
        for(int i=0;i<=nums.length;i++)
        {
            f=Math.max(f,i+nums[i]);
            if(i==c)
            {
                j++;
                c=f;
                if(c>=nums.length-1)
                return j;
            }
        }
        return j;
    }
}