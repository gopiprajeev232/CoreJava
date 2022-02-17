import java.util.Scanner;

public class MadLibsProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adjective1;
        System.out.print("Enter adjective: ");
        adjective1 = sc.nextLine();

        String girlsName;
        System.out.print("Enter girl's name: ");
        girlsName = sc.nextLine();

        String adjective2;
        System.out.print("Enter another adjective: ");
        adjective2 = sc.nextLine();

        String occupation1;
        System.out.print("Enter occupation: ");
        occupation1 = sc.nextLine();

        String placeName;
        System.out.print("Enter place name: ");
        placeName = sc.nextLine();

        String clothing;
        System.out.print("Enter Clothing: ");
        clothing = sc.nextLine();

        String hobby;
        System.out.print("Enter hobby: ");
        hobby = sc.nextLine();

        String adjective3;
        System.out.print("Enter another adjective: ");
        adjective3 = sc.nextLine();

        String occupation2;
        System.out.print("Enter another occupation:  ");
        occupation2 = sc.nextLine();

        String boysName;
        System.out.print("Enter a boy's name: ");
        boysName = sc.nextLine();

        String mansName;
        System.out.print("Enter a man's name: ");
        mansName = sc.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " who was a "+ adjective2+""+occupation1+" in the Kingdom of " + placeName + ".");
        System.out.println("She Loved to wear " + clothing + " and to "+hobby + ". She wanted to marry "+ adjective3+" "+occupation2+ " named " + boysName + " but her father, King " + mansName+" forbid her from seeing him.");

    }
}

