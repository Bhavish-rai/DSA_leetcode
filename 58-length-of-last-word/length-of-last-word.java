class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
       for(int i=s.length()-1;i>=0;i--)
       {

            if(s.charAt(i)==' '&&l==0)
            {
                continue;
            }
            else if(s.charAt(i)==' '&&l!=0)
            {
                break;
            }
           else if(Character.isLetter(s.charAt(i)))
            {
                    l++;
            }
       }
       return l; 
    }
}