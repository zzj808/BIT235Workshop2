public class CompoundInterest {
    public static void main(String[] args) {
        double P = 5000.00;
        double r = 0.04;
        int n = 10;

        double amount = P * Math.pow((1 + r), n);
        System.out.println("Final investment amount after 10 years: $" + amount);
    }
}