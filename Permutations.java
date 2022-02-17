import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            String[] name = sc.nextLine().split(" ");
            firstNames.add(name[0]);
            lastNames.add(name[1]);
        }

        for(int i=0; i<5; i++)
            for(int j=0; j<5; j++)
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
    }
}
