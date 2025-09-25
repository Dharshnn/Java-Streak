import java.util.Scanner;
public class methods {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = vowles(str);

        System.out.println("number of vowels present:" + count);
    }

    public static int vowles(String str) {
        int count = 0;
        System.out.println("you are inside vowels method");
        String lowerCasestr = str.toLowerCase();
        for (int i = 0; i < lowerCasestr.length(); i++) {
            char ch = lowerCasestr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
    return count;
    }
}
