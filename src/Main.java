import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n1; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            sum += quantity;
            if (sum > 255) {
                sum -= quantity;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}

