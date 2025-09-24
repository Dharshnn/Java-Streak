import java.util.Scanner;

public class areaOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}
