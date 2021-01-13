import java.util.*

class Atoi {
    public int myAtoi(String s) {
        int i = 0, s_size = s.length();
        if(s_size == 0) {
            return 0;
        }
        while(i < s_size && s.charAt(i) == ' ') i++;

        int sign = 0;
        if(i < s_size && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }else if(i < s_size && s.charAt == '-') {
            sign = -1;
            i++;
        }
        
        int base = 0;
        int  pos_limit = Integer.MAX_VALUE / 10, neg_limit = Math.abs(Integer.MIN_VALUE / 10);
        while(i < s_size && Character.isDigit(s.charAt(i))) {
            if(sign == 1 
                    && (base > pos_limit || (base == pos_limit && s.charAt(i) > '7')))
            {
                return Integer.MAX_VALUE;
            }

            if(sign == -1 && 
                    (base > neg_limit || (base == neg_limit && s.charAt(i) > '8')))
            {
                return Integer.MIN_VALUE;
            } 
            base = base * 10 + s.charAt(i) - '0';
            i++
        }

        return base * sign;
    }
}
