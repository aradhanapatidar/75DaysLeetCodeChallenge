class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []arr=new int[k];
        Arrays.sort(nums);
        int i=0,l=0;
        int count=1;
        PriorityQueue<Integer> list=new PriorityQueue<>();
    
       while(i<nums.length){
while(i<nums.length-1&&nums[i]==nums[i+1]){
    count++;
    i++;
}
list.offer(count);
count=1;
i++;
       }
int n=list.size()-k;
for( i=0; i<n; i++){
    list.poll();
}
     LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
     for( i=0; i<nums.length; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
      for(int key:map.keySet()){
        if(list.contains(map.get(key))){
            arr[l]=key;
            l++;
        }
      }
      return arr;
    }
}