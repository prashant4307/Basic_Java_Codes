public class plusone {
    public static void main(String[] args){
        int[] arr = {24,28,34,50,60};
        for( int i=0; i<arr.length; i++){
            arr[i] = arr[i] + 1;
        }
        for( int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
