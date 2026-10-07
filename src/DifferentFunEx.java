import java.util.Arrays;

public class DifferentFunEx {
    public static void main(String[] args) {
//        fun("Raghav");
        fun(2,3,4,5);
        fun("raghav");

    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String v){
        System.out.println(Arrays.toString(v.toCharArray()));
    }
}
