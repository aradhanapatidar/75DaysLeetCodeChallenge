class Solution {
    public int numberOfSubstrings(String s) {
       int minA=-1,minB=-1,minC=-1;
       int ans=0;
       for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='a')  minA=i;
        if(s.charAt(i)=='b')  minB=i;
        if(s.charAt(i)=='c')  minC=i;
int min=Math.min(minA,Math.min(minB,minC));
if(min!=-1)  ans=ans+min+1;
       }  
       return ans;
    }
}