package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("choice perimeter and area of shape want to check");
            System.out.println("1: triangle");
            System.out.println("2: rectangle");
            System.out.println("3: circle");
            System.out.println("other: exit program");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter 3 side of triangle: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int pT = a + b + c;
                    float pH = pT / 2;
                    float sT = (float) Math.sqrt(pH*(pH-a)*(pH-b)*(pH-c));
                    System.out.println("perimeter of triangle is "+ pT);
                    System.out.println("area of triangle is "+ sT);
                    System.out.println("end");
                    break;
                case 2:
                    System.out.println("Enter Width and Length of rectangle");
                    int width = sc.nextInt();
                    int length = sc.nextInt();
                    int pR = (width+length) * 2;
                    int sR = width * length;
                    System.out.println("perimeter of rectangle is " + pR);
                    System.out.println("area of rectangle is " + sR);
                    System.out.println("end");

                    break;
                case 3:
                    System.out.println("Enter radius of circle");
                    final float PI = 3.14F;
                    int r = sc.nextInt();
                    float pC = 2*PI * r;
                    float sC = (float) (PI * Math.pow(r,2));
                    System.out.println("perimeter of circle is: " + pC);
                    System.out.println("area of circle is: " + sC);
                    System.out.println("end");

                    break;
                default:
                    choice = 4;
                    System.out.println("exit program");
                    break;
            }
        } while (choice != 4);

    }
}
