import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.print("Enter the number of times that interest is compounded per year: ");
        int n = input.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100) / n, n * years);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest after " + years + " years: " + compoundInterest);

        input.close();
    }
}
