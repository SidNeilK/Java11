public class Test10 {
    public static void main(String[] args) {
        float income;
        System.out.println("Enter your monthly income:");
        income = scan.nextFloat();
        
        if (income < 0.0) {
            System.out.println("You are going farther into debt every month.");
        } else if (income < 1200.00) {
            System.out.println("You are living below the poverty line.");
        } else if (income < 2500.00) {
            System.out.println("You are living in moderate comfort.");
        } else {
            System.out.println("You are well off.");
        }
        
    }
}
