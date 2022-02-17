import java.util.Scanner;

public class ArraysProject {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i=0; i<5; i++)
            nums[i] = sc.nextInt();

        for(int i=0; i<5; i++)
            System.out.println(nums[i]*2);
    }
}
