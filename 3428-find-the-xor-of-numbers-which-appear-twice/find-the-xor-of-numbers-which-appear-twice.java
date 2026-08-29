class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int sum=0;
        for(int i : nums)
        {
            if(s.contains(i))
            {
                sum^=i;
            }
            else
            {
                s.add(i);
            }
        } 
        return sum;
    }
}