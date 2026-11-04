import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,5,3,6,7,3,2,9};

        Set<Integer> set = new LinkedHashSet<>();

        for(int num:arr){
            set.add(arr[num]);
        }
        System.out.println(set);
    }
}
