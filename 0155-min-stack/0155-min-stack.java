class MinStack {
Stack<Integer> st;
Stack<Integer> st1;
int min=Integer.MAX_VALUE;

    public MinStack() {
       st=new Stack<>(); 
       st1=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
      
        if(val<=min)  min=val;
        st1.push(min);
    }
    
    public void pop() {
        if(st.isEmpty())  return ;
       st.pop();
       st1.pop();
        if(!st1.isEmpty())
            min = st1.peek();
        else
            min = Integer.MAX_VALUE;
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int ans=st1.peek();
       return ans;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */