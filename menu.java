import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("what would you like to order");
        System.out.println("1.Burger");
        System.out.println("2.pizza");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter your preferencce");
                System.out.println("1.veg \n 2.non-veg");
                System.out.println("enter your choice");
                int Bchoice = sc.nextInt();

                switch (Bchoice) {
                    case 1:
                        System.out.println("you've selected veg");
                        break;
                    case 2:
                        System.out.println("you've selected non-veg");
                        break;
                    default:
                        System.out.println("invalid choice");
                }
                break; // This was the missing break

            case 2:
                System.out.println("enter your preferencce");
                System.out.println("1.veg \n 2.non-veg");
                System.out.println("enter your choice");
                int pchoice = sc.nextInt();

                switch (pchoice) {
                    case 1:
                        System.out.println("you've selected veg");
                        break;
                    case 2:
                        System.out.println("you've selected non-veg");
                        break;
                    default:
                        System.out.println("invalid choice");
                }
                break; // Added for completeness and good practice

            default:
                 System.out.println("invalid choice");
        }
    }
}
