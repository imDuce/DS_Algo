public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={10,0,3,4,0,76,0,9,0,0,45};
        moveZeros(arr);
    }

    public static void moveZeros(int arr[]) {
        int currZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[currZero];
                arr[currZero]= temp;
                currZero++;
            }
        }

        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
