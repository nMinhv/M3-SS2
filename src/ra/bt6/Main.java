package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("choice what you want to check with number");
            System.out.println("1: even or odd");
            System.out.println("2: is Prime");
            System.out.println("3: divisible for 3");
            System.out.println("other: exit program");
            choice = sc.nextInt();
            System.out.println("Enter Number want check:");
            int num = sc.nextInt();

            switch (choice) {
                case 1:
                    if(num % 2 == 0) {
                        System.out.println(num + " is even number");
                    } else {
                        System.out.println(num + " is odd number");
                    }
                    break;
                case 2:
                   boolean isPrime = true;
                   for (int i = 0; i < Math.ceil(Math.sqrt(num)) ; i++) {if(num % i == 0) {
                       isPrime = false;
                   }
                   }
                   if(isPrime) {
                       System.out.println(num + " is Prime number");
                   }else {
                       System.out.println(num + " is not Prime number");
                   }
                    break;
                case 3:
                    if(num % 3 == 0) {
                        System.out.println(num + " divisible for 3");
                    }else {
                        System.out.println(num + " indivisible for 3");
                    }
                    break;
                default:
                    System.out.println("exit program");
                    break;
            }
        } while (choice != 4);

    }
}
