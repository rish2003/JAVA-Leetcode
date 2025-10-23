package LeetCodeDsa.Strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        char[] arr = {'r','i','s','h','a','b','h'};
        System.out.println(arr[3]);
        String S = "chaitanya and Shruti";
        System.out.println(S.charAt(4));
        int n = S.length();
        System.out.println(n);

        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(x);
        String t = sc.nextLine();
        System.out.println(t);

        String name = "rishabh";
        String eman = "";
        for(int i = name.length()-1; i >= 0; i--){
            eman = eman + name.charAt(i);
        }
        System.out.println(eman);

        String name2 = "Rohan";
        StringBuilder eman2 = new StringBuilder();

        for(int i = name2.length()-1; i>=0;i--){
            eman2.append(name2.charAt(i));
        }
        System.out.println(eman2.toString());
        int num = 121;
        String numConvert = String.valueOf(num);
        System.out.println(numConvert);// converts int to string
        String numConv = Integer.toString(num);
        System.out.println(numConv);
        String num2 = "212";
        int num2convert = Integer.parseInt(num2);
        System.out.println(num2convert);
        int singleNum = (int)num2.charAt(0);
        System.out.println(singleNum);
        System.out.println("raghav"+10+20);
        System.out.println(10+20+"raghav");
        System.out.println(10+"raghav"+20);

        String himan = "Himanshu";
        String shu = himan.substring(0,1); // 0,1 -> H only not Hi
        System.out.println(shu);
        char[] himanArr = himan.toCharArray(); // to iterate a string
        for(int i = 0; i < himanArr.length; i++){
            System.out.println(himanArr[i] + " ");
        }
    }
}
