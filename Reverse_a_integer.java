public class Reverse_a_integer {
    public static void main(String[] args) {
        Integer num = 1233;
        Integer rev =0;

        while(num!=0){
            Integer digit = num%10;
            rev = rev *10 +digit;
            num /= 10;   // ← correct
        }

        System.out.println(rev);
        System.out.println("kkk");
    }
}
