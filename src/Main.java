import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double dollar =n*1.36;
        System.out.printf("%.3f",dollar);
    }
}
