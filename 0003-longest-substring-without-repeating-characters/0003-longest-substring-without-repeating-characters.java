class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int j=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(map.getOrDefault(s.charAt(i),0)==0){
                map.put(s.charAt(i),1);
                count++;
                max=Math.max(max,count);
            }else{
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            count++;
            while(map.getOrDefault(s.charAt(i),0)!=1){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                count--;
                j++;
            }
            }

        }
        return max;
    }
}