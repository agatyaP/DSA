class Solution {
    
    Stack <Character> s1 = new Stack();
    
    public boolean isValid(String s) {
        if (s.length()%2 !=0)
            return false;
        for(char c: s.toCharArray()){
            
            if( c== '(' || c == '{' || c == '[')
                s1.push(c);
            else if ( c == ')' && !s1.isEmpty() && s1.peek()=='(')
                s1.pop();
             else if(c=='}' && !s1.isEmpty() && s1.peek()=='{')
                s1.pop();
             else if(c==']' && !s1.isEmpty() && s1.peek()=='[')
                s1.pop();
            else return false;
            
        }
        return s1.isEmpty();
//         for (char c: s.toCharArray()) {
//         if (c == '(' || c == '{' || c == '[') {
//             stack.push(c);
//         }
//         else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
//             stack.pop();
//         }
//         else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
//             stack.pop();
//     }
//         else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
//             stack.pop();
//         }
//         else return false;
        
//     }
        
//         return stack.isEmpty();
        
    }
}