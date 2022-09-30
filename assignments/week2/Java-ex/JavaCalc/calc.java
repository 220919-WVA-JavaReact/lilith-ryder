public class calc {

    public static void main(String[] args) {
        System.out.println("Java Calculator v0.1");
        System.out.println("Please enter your operator followed by two numbers.");
        System.out.println("For a list of operators, enter 'ophelp'.");

        String operation;
        float n1;
        float n2;

        if (operation.equals("ophelp")) {
            System.out.println("enter 'SUM' to add two numbers.");
            System.out.println("enter 'DIF' to subtract the second number from the first.");
            System.out.println("enter 'PRD' to multiply two numbers.");
            System.out.println("enter 'QUO' to divide the first number by the second.");
            System.out.println("enter 'exit' to quit.");
        } else if (operation.equals("SUM")) {
            float result = (n1 += n2);
            return result;
        } else if (operation.equals("DIF")) {
            float result = n1 -= n2;
            return result;
        } else if (operation.equals("PRD")) {
            float result = n1 * n2;
            return result;
        }
        else if (operation.equals("QUO")) {
            float result = n1 / n2;
            return result;
        }
        else if (operation.equals("exit")) {
            break;
        }
        else {
            System.out.println("invalid operator!");
        }
    }
}