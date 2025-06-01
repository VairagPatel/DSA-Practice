public class Six {
    public static boolean Issorted(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Issorted(arr,i+1);   
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = Issorted(arr, 0);
        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
