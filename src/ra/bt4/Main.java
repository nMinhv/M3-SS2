package ra.bt4;

public class Main {
    public static void main(String[] args) {
        int c = 0;
        int num = 1;
        String  str = "";
        while (c < 20) {
            num++;
            boolean isPrime = true;
            for (int i = 2; i <= Math.ceil(Math.sqrt(num)); i++) {
                if (num % i == 0 && num !=2) {
                    isPrime = false;
                }
            }
                if (isPrime) {
                    str += " " + num;
                    c++;
                }

        }
        System.out.println(str);


    }
}
