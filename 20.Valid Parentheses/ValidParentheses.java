import java.util.*; 
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> left = new Stack<Character>();
        int size = s.length();
        for(int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                left.push(c);
            }else {
                if(left.empty()) {
                    return false;
                }
                char l = left.peek();
                if((c == ')' && l == '(') || (c == ']' && l == '[')
                     ||(c == '}' && l == '{')) {
                    left.pop();     
                }else {
                    return false;
                }
            }
        }

        return left.empty();
    }
}
