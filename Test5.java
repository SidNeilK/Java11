public class Test5 {
    public static void main(String[] args) {
        int n; //Outputs of each
        System.out.println((n = 4));              // 4
        System.out.println((n == 4));             // true
        System.out.println((n > 3));              // true
        System.out.println((n < 4));              // false
        System.out.println((n = 0));              // 0
        System.out.println((n == 0));             // true
        System.out.println((n > 0));              // false
        System.out.println((n == 0 && true));     // true
        System.out.println((n == 0 || true));     // true
        System.out.println((!(n == 2)));          // true
    }
}
