import java.util.*;
public class SubsequenceSum {
    public static void main(String[] args) {
        int arr[]= {2,3,4,5};
        int l = sumS(arr, new ArrayList<>(),0,0,7);
        System.out.println(l);

    }

    public static int sumS(int  arr[],List<Integer> op,int sum, int index, int target) {
        if(index == arr.length ){
            if(sum==target){
                return 1;
            // System.out.println(op);
        }
        return 0;
        }

        op.add(arr[index]);
        sum=sum+arr[index];
        int l =sumS(arr, op, sum, index+1, target);
        op.remove(op.size()-1);
        sum=sum-arr[index];
        int r= sumS(arr, op, sum, index+1, target);

        return l+r;

    }
}
