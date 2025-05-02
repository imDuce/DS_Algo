package Recursion;

public class StringSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        subsq(s, "", 0); 
    }

    public static void subsq(String s, String curr, int index) {
        if(index == s.length()){
            System.out.println(curr);
            return ;
        }
        subsq(s, curr, index+1);
        subsq(s, curr+s.charAt(index), index+1);
        
    }
}
