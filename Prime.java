public class Prime {
    public static void main(String[] args) {
        Boolean prime = true;

        int n=4;

        if(n==1 || n==2){
            prime = false;
        }

    for(int i = 2 ; i<=Math.sqrt(n);i++){
        if(n%i==0){
            prime= false;
            break;
        }
    }

    if(prime){
        System.out.println(n + " Is  a prime number");
    }else{
        System.out.println(n + " Is not a prime number");
    }

    }
}
