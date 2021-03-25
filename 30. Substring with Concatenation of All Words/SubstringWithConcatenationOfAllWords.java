import java.util.*; 

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<String, Integer> s_count = new HashMap<String, Integer>();
        for(String word : words) {
            s_count.put(word, s_count.getOrDefault(word, 0)+1);
        }

        int word_length = words[0].length();
        int words_length = word_length * words.length;
        int s_length = s.length();
        for(int i = 0; i < s_length - word_length+1; i++) {
            HashMap<String, Integer> seen = 
                new HashMap<String, Integer>();
            int j = i;
            for(; j < i+words_length && j+word_length <= s_length; j+=word_length) {
                String next_word = s.substring(j, j+word_length);
                if(s_count.getOrDefault(next_word,0) - seen.getOrDefault(next_word, 0) < 1) {
                    break;
                }
                seen.put(next_word, seen.getOrDefault(next_word, 0) + 1);
            }

            if(j == i+words_length) {
                result.add(i);
            }
        }

        return result;
    }
}
