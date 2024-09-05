import java.util.Arrays;

class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int target = mean * (m + n);
        int actual = 0;
        for(int x : rolls) {
            actual += x;
        } 

        int nArraySum = target - actual;
        if(nArraySum > n * 6 || nArraySum < n) {
            return new int[]{};
        }
        int[] res = new int[n];
        int minBase = nArraySum / n;
        Arrays.fill(res, minBase);
        
        nArraySum -= minBase * n;
        int i = 0;
        while(nArraySum != 0) {
            res[i]++;
            nArraySum--;
            i++;
        }
        

        return res;
    }
}