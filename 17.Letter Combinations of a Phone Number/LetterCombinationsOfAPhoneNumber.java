import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        int num_digits = digits.length();
        ArrayList<String> result = new ArrayList<>();
        if(num_digits == 0)
        {
            return result;
        }

        Map<Character, String> m = new HashMap<Character, String>();
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");

       result.add("");
       for(int i = 0; i < num_digits; i++)
       {
            ArrayList<String> new_result = new ArrayList<String>();
            String code = m.get(digits.charAt(i));
            for(String prev : result)
            {
                for (int j = 0; j < code.length(); j++)
                {
                    new_result.add(prev + code.charAt(j));
                }
            }
            result = new_result;
       }
       return result;
    }
}
