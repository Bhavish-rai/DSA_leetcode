class Solution {
    public boolean isPalindrome(int x) {
        int n= x;
        int rev=0;
        if(n<0)
        {
            return false;
        }
        else{
        while(x!=0)
        {
            int r=x%10;
            rev=rev*10+r;
            x=x/10;

        }
        if(n==rev)
        {
            return true;
        }
        else
        return false;
        }
    }
}