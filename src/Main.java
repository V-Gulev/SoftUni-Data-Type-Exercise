import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double km =(n/1000);
        System.out.printf("%.2f",km);
    }
}
