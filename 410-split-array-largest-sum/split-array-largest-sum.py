class Solution:
    def splitArray(self, nums: list[int], k: int) -> int:
        def fun(capacity):
            parts = 1
            total = 0

            for num in nums:
                if total + num <= capacity:
                    total += num
                else:
                    parts += 1
                    total = num

            return parts <= k

        l = max(nums)
        r = sum(nums)
        ans = r

        while l <= r:
            mid = (l + r) // 2

            if fun(mid):
                ans = mid
                r = mid - 1
            else:
                l = mid + 1

        return ans