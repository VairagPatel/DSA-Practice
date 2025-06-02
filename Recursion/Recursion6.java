public class Recursion6 {
    public static boolean Issorted(int[] arr,int i){

        // for(int i = 0;i<arr.length;1++){
        //     if(arr[i]>arr[i+1]){
        //         return false;
        //     }
        //     return true;
        // }

        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Issorted(arr,i+1);   
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5};
        boolean result = Issorted(arr, 0);
        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
