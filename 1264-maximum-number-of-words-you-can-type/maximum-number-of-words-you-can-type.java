class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
         String[] word= text.split(" ");
         boolean x;
         int count=0;
        for(int i=0;i<word.length;i++)
        { x=true;
            for(int j=0;j<brokenLetters.length();j++)
            {
                    if(word[i].indexOf(brokenLetters.charAt(j))!=-1)
                    {
                        x=false;
                        break;
                        
                    }

                    
            }
                if(x)
                {
                        count++;
                }
            
        }
        return count;
    }
}