package ConditionalAndLoops.arul;
import java.util.Scanner;
public class FinalLoanCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        int payment = (amount * 271)/1000;
        int remaining = (amount - payment);

        System.out.println(remaining);
    }
}
