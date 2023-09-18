package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first integer: ");
        int fN = sc.nextInt();
        System.out.println("enter last integer:");
        int sN = sc.nextInt();
        int sum = 0;
        for (int i = fN; i <= sN; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum of even number range " +fN +" to " + sN + " is " + sum);
    }
}
