class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            continue;
            for(int j=i+1;j<nums.length;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])
                continue;
                int l=j+1;
                int k=nums.length-1;
                while(l<k)
                {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];
                    if(sum==target)
                    {
                        a.add(Arrays.asList(nums[i], nums[j], nums[l], nums[k]));
                        l=l+1;
                        k=k-1;
                        while(l<k &&  nums[l]==nums[l-1])
                        l++;
                        while(l<k &&  nums[k]==nums[k+1])
                        k--;

                    }
                    else if(sum<target)
                    l=l+1;
                    else
                    k=k-1;

                }
            }
        }
        return a;
    }
}