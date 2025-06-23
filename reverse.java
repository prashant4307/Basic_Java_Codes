import java.util.*;
public class reverse {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of Array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter your array element: ");
       for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
       } 
       for(int i=0; i<n; i++){
        System.out.print (arr[i] + " " );
       } 
       System.out.println();
       for(int i=n-1; i>=0; i--){
        System.out.print (arr[i] +" ");
       }

    }
}
