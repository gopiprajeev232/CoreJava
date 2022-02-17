import java.util.Scanner;
import java.util.ArrayList;

public class ParallelListsPractice {


    public static void main(String[] args) {
        Scanner    sc = new Scanner(System.in); 
        
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        String name;
        int age;

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();

            System.out.println("Enter an age: ");
            age = sc.nextInt();

            sc.nextLine();

            names.add(name);
            System.out.println();

            ages.add(age);
        }

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i)+" years old");
        }

    }

}