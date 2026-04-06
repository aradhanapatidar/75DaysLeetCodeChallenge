class Solution {
    public int findMin(int[] nums) {
      int ans=-1;
     for(int i=0; i<nums.length-1; i++){
        if(nums[i]>nums[i+1])  {
           ans=   nums[i+1];
             break;
     }   
     }
    if(ans==-1)  ans=nums[0];
     return ans;  
    }
}