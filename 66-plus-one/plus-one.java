class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i] +=1;
               
                return digits;
            }
            digits[i]=0;
        }
    int[] result= new int[digits.length+1];
    result[0]=1;
    return result;
    }
    
    public void main(String[] args) 
    { int digits[] ={4,3,2,1};
    Solution s1= new Solution();
        int res[]=s1.plusOne(digits);
        for(int x:res)
        {
            System.out.println(x+" ");
        }
    }
}