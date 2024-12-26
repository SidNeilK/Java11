public class Test8 {
    public static void main(String[] args) {
        boolean found = false;
        int count = 5;

        if (!found || --count == 0) {
            System.out.println("danger");
        }
        System.out.println("count = " + count);
    }
}