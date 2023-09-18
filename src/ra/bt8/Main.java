package ra.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        do {
            System.out.println("enter there side of triangle");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a) {
                System.out.println("not a triangle, please enter again");

            } else {
                int pT = a + b + c;
                float pH = pT / 2;
                float sT = (float) Math.sqrt(pH*(pH-a)*(pH-b)*(pH-c));
                System.out.println("perimeter of triangle is "+ pT);
                System.out.println("area of triangle is "+ sT);
                System.out.println("end");
                check = false;
            }
        }
        while (check);

    }
}
