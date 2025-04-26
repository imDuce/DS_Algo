public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={5,54,36,44};
        System.out.println(sl(arr));

    }

    public static int sl(int arr[]) {
        int largest = largest(arr);
        System.out.println("largest:"+largest);
        int res =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1)
                res=i;

                else if(arr[i]>arr[res])
                res=i;
            }
        }
        return res;

    }

    public static int largest(int arr[]) {
        int res =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }
}
