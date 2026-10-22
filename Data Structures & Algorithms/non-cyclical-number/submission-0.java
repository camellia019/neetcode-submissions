class Solution {
    public boolean isHappy(int n) {
        //result = 0

        //while loop n > 0
        //digit = n % 10, result += digit^2
        //digit /= 10;

        //if result != 1, continue loop, and if really not equal to 1, return false
        //if result == 1, return true

        while(n != 1 && n != 4){
           int res = 0;

           while(n > 0){
                int digit = n % 10;
                res += digit * digit;
                n/= 10;
           }
           n = res;
        }

        if (n == 1) return true;
        else return false;
    }

}
