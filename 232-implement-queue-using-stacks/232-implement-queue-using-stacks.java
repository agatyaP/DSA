class MyQueue {
    Stack<Integer> s1 = new Stack<Integer>(); //push stack
    Stack<Integer> s2 = new Stack<Integer>(); //pop stack
    int front;

    public MyQueue() {
        
    }
    
    public void push(int x) {
       
        // Move all elements from s1 to s2
//         while (!s1.isEmpty())
//         {
//             s2.push(s1.pop());
//             //s1.pop();
//         }
 
//         // Push item into s1
//         s1.push(x);
 
//         // Push everything back to s1
//         while (!s2.isEmpty())
//         {
//             s1.push(s2.pop());
//             //s2.pop();
//         }
        if(s1.isEmpty())
            front=x;
        s1.push(x);
        
        
        
        
    }
    
    public int pop() {
        // int x =s1.peek();
        // s1.pop();
        // return x;
        
        if(s2.isEmpty()){
            //then add s1 items in reverse order
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
        // return s1.peek();
        if(!s2.isEmpty()){
            return s2.peek();
        }
        return front;
    }
    
    public boolean empty() {
        // return s1.isEmpty();
       return s1.isEmpty() && s2.isEmpty();
            
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */