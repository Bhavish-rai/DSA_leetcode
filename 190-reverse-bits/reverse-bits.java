class Solution {
    public int reverseBits(int n) {
       int a[]=new int[32];
       for(int i=0;i<32;i++)
       {
        a[i]=n&1;
        n>>>=1;
       }
       int ans=0;
       for(int i=0;i<32;i++)
       {
        ans=(ans<<1)|a[i];
       }
       return ans;
    }
}