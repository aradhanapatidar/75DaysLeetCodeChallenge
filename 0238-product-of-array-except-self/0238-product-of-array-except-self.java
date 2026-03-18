class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []answer=new int[nums.length];
        int n=nums.length;
        answer[0]=1;
        for(int i=1; i<n; i++){
        answer[i]=answer[i-1]*nums[i-1];
        }

        int val=1;
        for(int i=n-1; i>=0; i--){
            answer[i]=answer[i]*val;
            val*=nums[i];

        }
      return answer;
    }
}