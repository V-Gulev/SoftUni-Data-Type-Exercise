import java.util.*;

public class Main {
    public static double[] arrayFromInput(String s) {

        String[] items = s.split(" ");
        double[] numbers = new double[items.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(items[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int checkTill = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= checkTill; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }

    }
}
