import java.util.*;

class Reverse_Integer
{
	public int reverse(int x)
	{
		int base = 0;
		while(x != 0)
		{
			int rem = x % 10;
			x = x / 10;
           
            if (base > Integer.MAX_VALUE/10 || (base == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (base < Integer.MIN_VALUE/10 || (base == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
			base = base * 10 + rem;
		}

		return base;
	}
}
