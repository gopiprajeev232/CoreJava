import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+': {
                System.out.println(a + b);
                break;
            }

            case '-': {
                System.out.println(a - b);
                break;
            }

            case '*': {
                System.out.println(a * b);
                break;
            }

            case '/': {
                System.out.println(a/b);
                break;
            }

            default: {
                System.out.println("Enter proper operator");
            }
        }
    }
}
