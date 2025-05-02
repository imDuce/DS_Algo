public class RemoveElementsFromSortedArray {
    public static void main(String[] args) {
        int arr [] = {10,10,20,20,30,40,40};
        remove(arr);
    }

    public static void remove(int arr[]) {
        int len = arr.length;
        int counter =1;
        for(int i =1;i<len;i++){
            if((arr[i]!=arr[counter-1])){
                arr[counter]= arr[i];
                counter++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
