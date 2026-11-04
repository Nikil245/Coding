public class Palindrome {
    public static void main(String[] args) {
        String Word = "madam";
        String rev = "";

        for(int i=Word.length()-1;i>=0;i--){
            rev +=Word.charAt(i);
        }

        if(rev.equals(Word)){
            System.out.println("The word is palindrome");
        }else{
            System.out.println("The word is not plaindrome");
        }

        Integer num=121;
        Integer original = num;
        Integer rev_num=0;

        while(num!=0){
            Integer digit = num%10;
            rev_num = rev_num * 10 + digit;
            num /=10;
        }
        if(original.equals(rev_num)){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not Palindrome");
        }
    }
}
