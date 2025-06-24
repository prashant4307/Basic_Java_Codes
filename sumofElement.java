public class sumofElement {
    public static void main(String[] args){

        int[] arr = {34,45,32,50,58,42};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum/arr.length );
    }
}
