class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr=new int[2];
        int i=0;
        int j=nums.length-1;
        int sum=0;
        while(i<=j){
            sum=sum+nums[i]+nums[j];
            if(sum>target){
                sum=0;
                j--;
            }else if(sum<target){
                sum=0;
                i++;
            }else{
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
        }
        return arr;
    }
}