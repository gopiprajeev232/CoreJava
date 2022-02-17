public class StringBuilderTest {
    public static void main(String... args) {
        StringBuilder sb = new StringBuilder("My name is ");

        sb.append("Gopi Prajeev");
        System.out.println(sb);

        sb.insert(sb.length(), ".");
        System.out.println(sb);

        sb.replace(0, 2, "Your");
        System.out.println(sb);

        sb.delete(10, sb.length());
        System.out.println(sb);
    }
}
