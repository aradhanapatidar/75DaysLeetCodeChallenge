class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        char []arr=s.toCharArray();
      Stack<Character> st1=new Stack<>();
      
      for(int i=0; i<arr.length; i++){
        if(arr[i]=='('||arr[i]=='['||arr[i]=='{')
        st1.push(arr[i]);
        else  {
            if(st1.isEmpty())  return false;
        if(arr[i]==')')   if(st1.pop()!='(')   return false;
         if(arr[i]==']')   if(st1.pop()!='[')   return false;
          if(arr[i]=='}')   if(st1.pop()!='{')   return false;
        
        }
     
     }
     if(!st1.isEmpty())   return false;
return true;
    }
}