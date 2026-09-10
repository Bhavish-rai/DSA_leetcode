class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int vc=0;
        for(int n:nums)
        {
            if(vc==0)
            {
                c=n;
            }
            if(n==c)
            {
                vc++;
            }
            else{
                vc--;
            }
        }
        return c;
    }
}