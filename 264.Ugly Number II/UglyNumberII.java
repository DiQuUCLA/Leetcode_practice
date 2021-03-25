import java.util.*;
import java.lang.*; 

class UglyNumberII{
    public int nthUglyNumber(int n) {
        int two = 2, three = 3, five = 5;
        int two_multi=1, three_multi=1, five_multi=1;

        List<Integer> uglys = new ArrayList<Integer>();
        uglys.add(1);
        for(int i = 1; i < n; i++)
        {
            int next_ugly = Math.min(Math.min(two, three), five);
            uglys.add(next_ugly);

            if(two == next_ugly) {
                two = 2 * uglys.get(two_multi);
                two_multi++;
            }
            if(three == next_ugly) {
                three = 3 * uglys.get(three_multi);
                three_multi++;
            }
            if(five == next_ugly) {
                five = 5 * uglys.get(five_multi);
                five_multi++;
            }
        }
        return uglys.get(n-1);
    }
}
