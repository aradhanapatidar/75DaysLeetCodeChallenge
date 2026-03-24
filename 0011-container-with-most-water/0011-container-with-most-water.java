class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int total=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            total=Math.max(total,min*(j-i));
            if(height[i]<height[j])  i++;
            else j--;  
        }
        return total;
    }
}