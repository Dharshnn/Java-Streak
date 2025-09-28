import java.util.Scanner;
public class Array1 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j <n; j++) {
            System.out.println(arr[j]);
            count+=arr[j];
        }
        System.out.println(count);
    }
}
