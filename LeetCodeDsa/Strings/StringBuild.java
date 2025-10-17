package LeetCodeDsa.Strings;
import java.util.ArrayList;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rishabh");
        System.out.println(sb);
        sb.append("Raj");
        System.out.println(sb);
        sb.append(10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
