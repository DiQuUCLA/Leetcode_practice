import java.util.*;

class UglyNumber {
    public boolearn isUgly(int n) {
        if(n > 0)
        {
            n = -n;
        }else {
            return false;
        }
        while(n < 0 && n % 2 == 0){
            n /= 2;
        }

        while(n < 0 && n % 3 == 0){
            n /= 3;
        }

        while(n < 0 && n % 5 == 0){
            n /= 5;
        }

        return n == -1 || n == 0;
    }
}
