import java.util.Random;

public class RandomNumsPractice {
    public static void main(String... args) {
        Random r = new Random();

        int num = r.nextInt();

        System.out.println("Random num is: "+num);

        num = r.nextInt(1000);
        System.out.println("Random number in range 0 to 1000 is: "+num);

        num = r.nextInt(1000) + 1;
        System.out.println("Random number in range 1 to 1001 is: "+num);
    }
}
