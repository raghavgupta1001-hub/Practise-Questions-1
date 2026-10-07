import java.util.Scanner;

public class Finding3DigitsArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));
        for (int m = 100; m < 1000; m++) {
            if (isArmstrong(m)) {
                System.out.println(m);
            }
        }
    }
    static boolean isArmstrong(int m) {
        int original = m;
        int sum = 0;
        while (m > 0) {
            int rem = m % 10;
            m = m / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == original) {
            return true;
        }
        return false;

    }

    }

