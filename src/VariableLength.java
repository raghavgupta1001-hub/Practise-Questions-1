import java.util.Arrays;

public class VariableLength {
    public static void main(String[] args) {
        fun(2,4,3,5,6);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
