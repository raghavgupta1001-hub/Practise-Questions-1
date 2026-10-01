import java.util.Scanner;

public class GreetingAndName {
    public static void main(String[] args) {
        String name = myGreet();
        System.out.println(name);
    }
    static String myGreet() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your name:");
       String name = in.next();
        String message = " Hello Sukhi " + name;
        return message;
    }
}
