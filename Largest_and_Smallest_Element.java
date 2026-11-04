public class Largest_and_Smallest_Element {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4,5,6,7,3,1,9,13,1,5};

        int max= arr[0];
        int min= arr[0];

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }

        System.out.println("The max value:"+max);
        System.out.println("The min value:"+min);
    }
}
