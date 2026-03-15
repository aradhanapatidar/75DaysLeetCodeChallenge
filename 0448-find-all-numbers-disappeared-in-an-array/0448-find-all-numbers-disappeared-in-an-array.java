class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
       int k=0;
       while(k<nums.length){
        int correct=nums[k] -1;
        if(nums[k]!=nums[correct]){
            int temp =nums[k];
            nums[k]=nums[correct];
            nums[correct]=temp;
        }else
        k++;
       }
       for(int j=0; j<nums.length; j++){
        if(nums[j]!=j+1)  list.add(j+1);
       }
      return list;
    }
}