import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double years = a*100;
        double days= years*365.2422;
        double hours =days*24;
        double minutes = hours*60;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",a,years,days,hours,minutes);

    }
}
