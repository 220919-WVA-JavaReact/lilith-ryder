import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Java Calculator v0.2");
        System.out.println("Please enter your operator followed by two numbers.");
        System.out.println("For a list of operators, enter 'ophelp 0 0'.");

        String input2 = input.nextLine();

        String[] inputParse = input2.split(" ");

        String operation = inputParse[0];
        float n1 = Float.parseFloat(inputParse[1]);
        float n2 = Float.parseFloat(inputParse[2]);
        float result;

            switch (operation) {
                case "SUM":
                    result = n1 + n2;
                    System.out.println(result);
                    break;

                case "DIF":
                    result = n1 - n2;
                    System.out.println(result);
                    break;

                case "PRD":
                    result = n1 * n2;
                    System.out.println(result);
                    break;

                case "QUO":
                    result = n1 / n2;
                    System.out.println(result);
                    break;

                case "ophelp":
                    System.out.println("valid operations: [ SUM, DIF, PRD, QUO ]");
                    break;

                default:
                    System.out.println("invalid operation!");
                    break;

        /* for (operation, n1, n2;) {
        if (operation.equals("?")) {
            System.out.println("enter '+' to add two numbers.");
            System.out.println("enter '-' to subtract the second number from the first.");
            System.out.println("enter '*' to multiply two numbers.");
            System.out.println("enter '/' to divide the first number by the second.");
            System.out.println("enter 'q' to quit.");
        } else if (operation.equals("+")) {
            float result = (n1 += n2);

        } else if (operation.equals("-")) {
            float result = n1 -= n2;

        } else if (operation.equals("*")) {
            float result = n1 * n2;

        }
        else if (operation.equals("/")) {
            float result = n1 / n2;

        }
        else if (operation.equals("q")) {
            break;
        }
        else {
            System.out.println("invalid operator!"); */
            }
        }
}