import java.util.*;
public class max{
    public static void main(String[] args) {
        // int[] number = {24,28,21,45,74,89};
        // System.out.println("min number is: "  + min);
        // System.out.println("max number is: "  + max);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i]<min){
                min = number[i]; 
            }
            if(number[i]>max){
                max = number[i];
            }
        }
         System.out.println("min number is: "  + min);
         System.out.println("max number is: "  + max);
    }
}

