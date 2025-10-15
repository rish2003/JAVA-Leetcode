package LeetCodeDsa.Array;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + " ");
        }
        for(int k = 0; k < arr.length; k++){
            if(arr[k] >= 0){
                System.out.print(arr[k] + " ");
            }
        }
    }
}
