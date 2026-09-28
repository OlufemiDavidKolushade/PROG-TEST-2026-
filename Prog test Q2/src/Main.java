import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        String choice = sc.nextLine();

        switch (choice){
            case "1":
                choice = "PS5";
                break;

            case "2":
                choice = "XBOX";
                break;

            case "3":
                choice = "SWITCH";
                break;

            default:
                System.out.println("error");
        }

        System.out.println("Enter the store: ");
        String place = sc.nextLine();

        System.out.println("Enter the total sales of PS5 consoles for " +place +": " );
        int num = sc.nextInt();

        ConsoleSales CS = new ConsoleSales(choice, place, num);

        CS.printReport();
    }
}