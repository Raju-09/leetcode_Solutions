/*class Solution {
    public int divide(int dividend, int divisor) {
        return dividend/divisor;
        
    }
}*/

import java.util.*;

class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int val1 = dividend;
        int val2 = divisor;

        int res = val1 / val2;

        return res;
    }
}


/*

class Solution {

    public int divide(int dividend, int divisor) {

        // overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int answer = 0;

        while (dvd >= dvs) {

            long temp = dvs;
            int multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            answer += multiple;
        }

        // sign handling
        if ((dividend < 0) ^ (divisor < 0)) {
            answer = -answer;
        }

        return answer;
    }
}*/