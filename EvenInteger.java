public class EvenInteger {
    public static void main(String[] args){
        int[] arr = {20,23,38,35,37,10};
        int evenSum = 0;
        int OddSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println("Even No." + arr[i]);
                evenSum = arr[i] + evenSum; 
            } else{
                System.out.println("Odd No." + arr[i]);
                OddSum = arr[i] + OddSum;
            }
        }
        System.out.println("Even Sum :" + evenSum);
        System.out.println("Odd Sum: " + OddSum);
    }
}
