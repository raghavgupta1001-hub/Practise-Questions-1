import java.util.Scanner;

public class FruitChracteristics {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        if(fruit.equals("Mango")){
            System.out.println("king Of Fruits");
        }else if(fruit.equals("Orange")){
          System.out.println("Orange In Colour");
        }else if(fruit.equals("Apple")){
          System.out.println("Sweet Fruit");
         }else{
            System.out.println("Invalid Fruit");
        }
    }
}
