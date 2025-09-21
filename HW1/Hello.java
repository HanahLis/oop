import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.print(i);
            if (i % 100 >= 11 && i % 100 <= 20) {
                System.out.print("th");
            }

            else if (i % 10 == 1) System.out.print("st");
            else if (i % 10 == 2) System.out.print("nd");
            else if (i % 10 == 3) System.out.print("rd");

            else System.out.print("th");

            System.out.println(" Hello");
        }
    }
}
