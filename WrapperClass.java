import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(new Integer(10));
        al.add(11);

        String piStr = "3.14159";
        double pi = Double.parseDouble(piStr);

        System.out.println(pi);

    }
}
