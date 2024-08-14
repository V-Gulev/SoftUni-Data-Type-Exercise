import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =Integer.parseInt(scanner.nextLine());
        BracketsChecker(number, scanner);

    }

    public static boolean BracketsChecker(int numbers,Scanner scanner) {

        int openingBracketsCounter = 0;
        int closedBracketCounter = 0;
        boolean isBalanced = true;
        for (int i = 0; i < numbers; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openingBracketsCounter++;
                if (openingBracketsCounter - closedBracketCounter >= 2) {
                    isBalanced = false;
                    break;
                }

            } else if (input.equals(")")) {
                closedBracketCounter++;
                if (closedBracketCounter > openingBracketsCounter) {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (closedBracketCounter != openingBracketsCounter) {
            isBalanced = false;
        }
        ResultToPrintCheck(isBalanced);
        return isBalanced;
    }

    public static void ResultToPrintCheck(boolean isBalanced) {
        if (isBalanced) {
            System.out.println("BALANCED");
        } else System.out.println("UNBALANCED");
    }


}
