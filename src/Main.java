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
        int key = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <times ; i++) {
            char ch = scanner.nextLine().charAt(0);
            char decrypted = (char) (ch+key);
            System.out.print(decrypted);
        }

    }
}
