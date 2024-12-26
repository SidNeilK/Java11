public class Test15 {
    public static int enough(int goal) {
        int sum = 0, n = 1;
        while (sum < goal) {
            sum += n++;
        }
        return n - 1;
    }
    
}
