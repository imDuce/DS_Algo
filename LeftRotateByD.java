public class LeftRotateByD {
    public static void main(String[] args) {
        int arr[]= {12,45,54,66};
        LRD(arr, 1);
    }
    public static void LRD(int arr[], int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++)
        System.out.print(""+arr[i]+" ");
    }

    public static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
