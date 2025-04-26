import java.util.*;
public class AllPossiblePermutations {

    public static void main(String[] args) {
        int arr[]= {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean map [] = new boolean[arr.length];
        findAllPermutations(arr,ds,ans,map);
        System.out.println(ans);

    }

    public static void findAllPermutations(int arr[], List<Integer> ds,List<List<Integer>> ans, boolean [] map ){
        if(ds.size()== arr.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(!map[i]){
                map[i]=true;
                ds.add(arr[i]);
                findAllPermutations(arr, ds, ans, map);
                ds.remove(ds.size()-1);
                map[i]=false;
            }

        }
    }
}