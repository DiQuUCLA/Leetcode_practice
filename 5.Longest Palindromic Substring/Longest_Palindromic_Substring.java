class Longest_Palindromic_Substring {
    private int expand(String s, int left, int right){
        int s_size = s.length();
        while(left >= 0 && right < s_size && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int odd = expand(s, i, i);
            int even = expand(s, i, i+1);
            int m = Math.max(odd, even);
            if(m > end - start)
            {
                start = i - (m - 1) / 2;
                end = i + m / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
}