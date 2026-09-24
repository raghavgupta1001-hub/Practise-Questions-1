public class ReverseNo {
    public static void main(String[] args) {
        int num = 15526814;
        int ans = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}
