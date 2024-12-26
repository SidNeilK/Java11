public class Test14 {
    public static int sumFromTo(int first, int last) {
        int sum = 0;
        if (first > last) {
            int temp = first;
            first = last;
            last = temp;
        }
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        return sum;
    }
}
