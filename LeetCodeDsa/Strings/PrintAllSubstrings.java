package LeetCodeDsa.Strings;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String S = "gopi";
        printAllSubs(S);
    }
    public static void printAllSubs(String S){

        for(int i = 0; i <= S.length(); i++){
            for(int j = i; j <= S.length(); j++){
                System.out.println(S.substring(i,j));
            }
        }
    }
}
