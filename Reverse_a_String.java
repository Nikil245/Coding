public class Reverse_a_String {
    public static void main(String[] args) {
        String word = "Hello";
        String rev = "";

        for(int i=word.length()-1; i>=0; i--){
            rev +=word.charAt(i);
        }
        System.out.println(rev);
    }
}