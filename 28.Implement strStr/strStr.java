import java.util.*;

class strStr {
    public int strStr(String haystack, String needle) {
        int i = 0, stackSize = haystack.length(), needleSize=needle.length();
        while(i < stackSize) {
            int offset = 0;
            if (haystack.charAt(i+offset) == needle.charAt(offset) 
                    && offset < needleSize) {
                offset++;        
            }

            if(offset == needleSize){
                return i;
            }

            i++;
        }

        return -1;
    }
}


