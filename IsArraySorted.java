public class IsArraySorted {
    public static void main(String[] args) {
        int arr[]={12,13,67,455};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int arr[]) {
        for(int i=1;i<arr.length;i++){
            if(!(arr[i-1]<arr[i])){
                return false;
            }
        }
        return true;
    }
}
