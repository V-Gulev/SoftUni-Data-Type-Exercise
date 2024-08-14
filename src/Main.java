import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n1; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < n1; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < n1; k++) {
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }

    }
}

