package warmup_first;

public class NearHundred {

    /**
     * Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     * <p>
     * nearHundred(93) → true
     * nearHundred(90) → true
     * nearHundred(89) → false
     */

    public boolean nearHundred(int n) {
        n = Math.abs(n);
        if (n >= 90 && n <= 110) {
            return true;
        } else if (n >= 190 && n <= 210) {
            return true;
        }
        return false;
    }

}
