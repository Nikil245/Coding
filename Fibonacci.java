public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b=0;
        int next;

        //fibonacci of 10 numbers
        for(int i=1;i<=10;i++){
            System.out.println(b);
            next = a+b;
            b=a;
            a=next;
        }
    }
}
