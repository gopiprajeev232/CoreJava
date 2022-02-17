import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProject {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a positive real number or -1 to exit.");
            double input = sc.nextDouble();

            if(input >= 0) {
                numbers.add(input);
            }

            else {
                break;
            }
        }

        for(int i=numbers.size()-1; i>=0; i--)
            System.out.println(numbers.get(i));
    }
}
