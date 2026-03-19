class Solution {
    public boolean isPalindrome(String s) {
        String ans=s.toLowerCase();
        String result=ans.replaceAll("[^a-z0-9]", "");
        
        int i=0; 
        int j=result.length()-1;
        while(i<j){
            if(result.charAt(i)!=result.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}