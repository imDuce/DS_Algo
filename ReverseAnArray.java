public class ReverseAnArray {
    
    public static void main(String[] args) {
        int arr[]={10,20,33,24,66};
        rev(arr);
    }

    public static void rev(int arr[]) {
        int len =arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[len];
            arr[len]=temp;
            len--;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
