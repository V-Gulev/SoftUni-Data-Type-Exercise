import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        double sum ;
        double bigestKeg = 0;
        String kegName = "";
        for (int i = 0; i < n1; i++) {
            String model = scanner.nextLine();
            double radius= Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            sum = Math.PI*radius*radius*height;
            if (sum>=bigestKeg){
                bigestKeg=sum;
                kegName=model;
            }
        }
        System.out.printf("%s",kegName);
    }
}

