import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%3 == 0)
            System.out.printf("%d is divisible by 3.", num);

        else
            System.out.printf("%d is not divisible by 3.", num);
    }
}
