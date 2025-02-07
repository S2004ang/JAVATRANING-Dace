import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, };
        System.out.println(a);// 1st way//

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        int b[] = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int value : b) {
            System.out.print(value + " ");
        }
    }
}
