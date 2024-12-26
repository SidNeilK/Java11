public class Test19 {
    public static boolean reduce(int[] fraction) {
        if (fraction[0] <= 0 || fraction[1] <= 0) return false;
        int gcdValue = gcd(fraction[0], fraction[1]);
        fraction[0] /= gcdValue;
        fraction[1] /= gcdValue;
        return true;
    }
    
}
