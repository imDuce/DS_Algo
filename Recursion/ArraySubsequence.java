package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySubsequence {
    public static void main(String[] args) {
        int arr []={1,2,3};
        List<Integer> output = new ArrayList<>();
        subsq(arr, output, 0);
    }
    

    public static void subsq(int arr[], List<Integer> output, int index) {
        if(index >= arr.length){
            System.out.println(output);
            return;
        }

        output.add(arr[index]);
        subsq(arr, output, index+1);
        output.remove(output.size()-1);
        subsq(arr, output, index+1);

    }
}
