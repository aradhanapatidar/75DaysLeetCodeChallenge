class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int i=temperatures.length-1;
        int n=temperatures.length;
        int []ans=new int[temperatures.length];
        while(i>=0){
        while(!st.isEmpty()&&temperatures[st.peek()]<=temperatures[i]){
            st.pop();
        }
        if(st.isEmpty()){
           ans[i]=0;
        }else{
            ans[i]=st.peek()-i;
        }
        st.push(i);
        i--;

        }
        return ans;
    }
}