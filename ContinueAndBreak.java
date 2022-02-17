public class ContinueAndBreak {
    public static void main(String[] args) {
        int val = 0;

        while(val < 10) {
            if(val%3 == 0) {
                val++;
                continue;
            }

            else if(val == 8)
                break;

            System.out.print(val + "\t");

            val++;
        }
    }
}

