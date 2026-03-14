class Solution {
    public boolean isAnagram(String s, String t) {
        char []nums=new char[26];
      if(s.length()!=t.length())  return false;
      for(int i=0; i<s.length(); i++){
            nums[s.charAt(i)-'a']++;
            nums[t.charAt(i)-'a']--;
        }
      for(int j=0; j<nums.length; j++){
        if(nums[j]!=0)  return false;
      } 
      return true;
    }
}