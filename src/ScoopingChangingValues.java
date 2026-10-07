public class ScoopingChangingValues {
    public static void main(String[] args) {
        int a = 90;
        int b = 60;
//        System.out.println();
        {
            a = 99;
            System.out.println();
//            int c;
//            c = 22;
//            System.out.println(c);
        }
        System.out.println(a);
    }
}


