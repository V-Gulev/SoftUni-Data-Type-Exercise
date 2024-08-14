import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        double biggestValue = 0.0;
        int biggestSnow = 0;
        int biggestTime = 0;
        int biggestQuality = 0;

        for (int i = 0; i < numberSnowballs; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow((double) snow / time, quality);

            if (value > biggestValue) {
                biggestValue = value;
                biggestSnow = snow;
                biggestQuality = quality;
                biggestTime = time;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", biggestSnow, biggestTime, biggestValue, biggestQuality);
        scanner.close();
    }
}
