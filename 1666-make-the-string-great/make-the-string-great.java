class Solution {
    public String makeGood(String s) {
        StringBuilder r= new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(r.length()>0)
            {
                int last=r.charAt(r.length()-1);
                if(last+32==c || last-32==c)
                {
                    r.deleteCharAt(r.length()-1);
                    continue;
                }
            }
            r.append(c);
        }
        return r.toString();

    }
}