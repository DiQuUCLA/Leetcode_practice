import java.util.*;

class GenerateParentheses {
    public List<String> util(String prev, int left, int right) {
        List<String> result = new ArrayList<String>();
        if(right == 0) {
            result.add(prev);
        }else {
            if(left > 0) {
                result.addAll(this.util(prev + '(', left-1, right));
            }
            if(left < right) {
                result.addAll(this.util(prev + ')', left, right-1));
            } 
        }

        return result;
    }
    public List<String> generateParenthesis(int n) {
        return util("", n, n);
    }
}
