package ra.bt5;

public class Main {
    public static void main(String[] args) {
        int num = 1;
        boolean find = true;
        while (find) {
            if(num % 5 == 0 && num % 7 == 0 && num %11 == 0) {
                System.out.println(num);
            find = false;
            }
            num++;
        }
    }
}
