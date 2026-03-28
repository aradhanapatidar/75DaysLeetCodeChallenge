class Solution {
    public int characterReplacement(String s, int k) {
        int r=0;
        int l=0;
        int max=Integer.MIN_VALUE;
        int maxfre=Integer.MIN_VALUE;

        int []arr=new int[26];
        while(r<s.length()){
        arr[s.charAt(r)-'A']++;
        maxfre=Math.max(maxfre,arr[s.charAt(r)-'A']);
        
        while((r-l+1)-maxfre>k&&l<s.length()){
            arr[s.charAt(l)-'A']--;
             l++;
        }
        max=Math.max(max,r-l+1);
        r++;
        }
        return max;
  }
}