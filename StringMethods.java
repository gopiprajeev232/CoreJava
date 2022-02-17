public class StringMethods {
    public static void main(String[] args) {
        String name = "Gopi";
        String name2 = "Prajeev";
        String name3 = "Prajeev";

        for(int i=0; i<name.length(); i++)
            System.out.println(name.charAt(i));

        if(name2.equals(name3))
            System.out.println("Both are equal");

        else
            System.out.println("Both are not equal");

        if(name.compareTo(name2) > 0)
            System.out.println("name greater than name2");

        else
            System.out.println("name less than or equal to name2");

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('i'));
        System.out.println(name2.substring(5));
    }
}
