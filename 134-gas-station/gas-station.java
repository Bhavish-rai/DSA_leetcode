class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumg=0;
        int sumc=0;
        for(int i=0;i<gas.length;i++)
        {
                sumg+=gas[i];
                sumc+=cost[i];
        }
        if(sumg<sumc)
        {
            return -1;
        }
        int sumg1=0;
        int sumc1=0;
        int index=0;
        for(int i=0;i<cost.length;i++)
        {
            sumg1+=gas[i];
            sumc1+=cost[i];
            if(sumg1<sumc1)
            {
                sumg1=0;
                sumc1=0;
                index=i+1;
            }
        }
        return index;
    }
}