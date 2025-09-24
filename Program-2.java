import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // Generate and print the series
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1; // Formula for i-th odd number
            if (i == a) {
                System.out.print(oddNumber); // Avoid extra comma at end
            } else {
                System.out.print(oddNumber + ", ");
            }
        }

        sc.close();
    }
}
