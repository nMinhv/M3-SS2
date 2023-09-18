package ra.bt2;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.printf("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i< 5; i++) {
            for ( int j = 5; j > 0 ; j--) {
                if(j > i) {
                    System.out.printf("* ");
                }
            }
                System.out.println();
        }
        for (int i = 0; i < 5; i++) {

        }
    }
}
