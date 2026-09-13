class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxA=0;
        int A;
        while(l<r)
        {   int h=Math.min(height[l],height[r]);
            int width=r-l;
            A=h*width;
            maxA=Math.max(A,maxA);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxA;
    }
}