class MinStack {
    //using 2 stacks
    Stack<Integer> s1 = new Stack <Integer>();
    Stack<Integer> minstack = new Stack <Integer>();
    int min=Integer.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(minstack.isEmpty() || val<=minstack.peek()){
            minstack.push(val);
        }
        
        s1.push(val);
    }
    
    public void pop() {
        if(s1.peek().equals(minstack.peek())){
            minstack.pop();
        }
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
    
//     using only one stack
//     Stack<Integer> s1 = new Stack <Integer>();
//     int min=Integer.MAX_VALUE;

//     public MinStack() {
        
//     }
    
//     public void push(int val) {
//         if 
//     }
    
//     public void pop() {
        
//     }
    
//     public int top() {
        
//     }
    
//     public int getMin() {
        
//     }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */