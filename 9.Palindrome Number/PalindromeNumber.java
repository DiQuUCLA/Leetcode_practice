import java.util.*;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;

        int base = 0, x_copy = x;
        while(x > 0)
        {
            int rem = x % 10;
            x /= 10;

            base = base * 10 + rem;
        }
        return base == x_copy;
    }
}
