import java.util.*;

class LongestCommonPrefix {
    public String Util(String str1, String str2) {
        int i = 0, size1 = str1.length(), size2 = str2.length();
        while(i < size1 && i < size2 && str1.charAt(i) == str2.charAt(i)){
            i++;
        }
        return str1.substring(0, i);
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        String prefix = strs[0];
        for(int i = 1; i < strs.length && !prefix.equals(""); i++)
        {
            prefix = Util(prefix, strs[i]);
        }
        return prefix;
    }
}
