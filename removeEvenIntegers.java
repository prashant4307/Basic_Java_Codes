public class removeEvenIntegers{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static int[] removeEven(int[]arr){
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 != 0){
                oddCount++ ;

            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {2,5,6,8,9,4,10};
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);
    }

}
/*public class removeEvenIntegers {

    // Fixed method to print the array
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Fixed method to remove even integers
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;

        // Count how many odd numbers are in the array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Create a new array of size = number of odd numbers
        int[] result = new int[oddCount];
        int idx = 0;

        // Copy odd numbers to the result array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                result[idx++] = arr[i];
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 4, 10};
        System.out.print("Original array: ");
        printArray(arr);

        int[] result = removeEven(arr);
        System.out.print("Array after removing even numbers: ");
        printArray(result);
    }
}*/
