import java.util.*

// It contains all kind of characters
class LSWRC
{
	public int lengthOfLongestSubstring(String s)
	{
		Map<Character, Integer> map = new HashMap<>();
		int left = 0, s_size = s.length(), max_len = 0;

		for(int i = 0; i < s_size; i++)
		{
			char cur = s.charAt(i);
			if(map.containsKey(cur) && map.get(cur) >= left)
			{
				if(i - left > max_len)
				{
					max_len = i - left;
                }
				left = map.get(cur) + 1;
			}

			map.put(cur, i);
		}

		if(s_size - left > max_len)
			return s_size - left;
		return max_len;
	}
}
