import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        sum2();

        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("The Sum = " + sum);

    }

    static void sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);


//    static int sum3(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
    }
}





