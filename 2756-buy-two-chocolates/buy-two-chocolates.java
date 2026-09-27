class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE;;
        int min2=Integer.MAX_VALUE;;
        for(int i:prices)
        {
            if(i<min)
            {
                min2=min;
                min=i;
            }
            else if(i<min2)
            {
                min2=i;
            }
        }
        int r=min2+min;
        if(r<=money)
        {
            return money-r;
        }
        return money;
    }
}