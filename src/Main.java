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

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            if (Main.isInt(input)) {
                System.out.printf("%s is integer type%n", input);
            } else if (Main.isDouble(input)) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() < 2) {
                System.out.printf("%s is character type%n", input);
            } else if (Main.isBoolean(input)) {
                System.out.printf("%s is boolean type%n", input);
            } else System.out.printf("%s is string type%n", input);
        }
    }

    static boolean isBoolean(String s) {
        return s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false");
    }


    static boolean isDouble(String s) {
        try {
            double i = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException er) {
            return false;
        }
    }

    static boolean isInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException er) {
            return false;
        }
    }

}

