class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d={}
        for i in range(len(nums)):
            left=target-nums[i]
            if left in d:
                return d[left],i
            else:
                d[nums[i]]=i