
import java.util.Scanner;

public class Questions {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte b = 24;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) + (d*s);
        System.out.println(result);
        float tempC = in.nextFloat();
        float tempF = (tempC*9/5 + 32);
        System.out.println(tempF);
        int salary = 5000;
        if(salary>10000){
            salary = salary + 2000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);
        int n = in.nextInt();
        for (int num = 0; num <= n ;num++) {
            System.out.print(num + " ");
        }

    }
}
