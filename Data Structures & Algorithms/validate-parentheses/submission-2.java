class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char str:s.toCharArray()){
            if(str=='(')stack.push(')');
            else if(str=='{')stack.push('}');
            else if(str=='[')stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=str)return false;
        }
        return stack.isEmpty();
    }
}
