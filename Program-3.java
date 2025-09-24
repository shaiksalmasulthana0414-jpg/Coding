import java.util.Scanner;

public class OddSeriesWithCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // Decide how many odd numbers to print
        int terms;
        if (a % 2 == 0) {
            terms = a - 1; // for even, one less
        } else {
            terms = a; // for odd, same as input
        }

        // Generate and print the series
        System.out.print("Output: ");
        for (int i = 1; i <= terms; i++) {
            int oddNumber = 2 * i - 1; // formula for ith odd number
            if (i == terms) {
                System.out.print(oddNumber);
            } else {
                System.out.print(oddNumber + ", ");
            }
        }

        sc.close();
    }
}
