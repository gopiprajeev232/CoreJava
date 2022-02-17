import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Gopi");
        names.add("Prajeev");
        names.add("Ram");
        names.add("Ramesh");

        for(String name : names)
            System.out.print(name+" ");
    }
}
