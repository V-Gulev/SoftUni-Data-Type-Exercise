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
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (Math.abs(a-b)<0.000001){
            System.out.println("True");
        }else System.out.println("False");
    }
}
