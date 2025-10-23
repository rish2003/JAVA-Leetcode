package LeetCodeDsa.Sorting;

public class BubbleEarlyExit {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        print(arr);
        bubbleEarlyExit(arr);
        print(arr);
    }

    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void bubbleEarlyExit(int[] arr){
        int n = arr.length;
        for(int pass = 0; pass < n - 1; pass++){
            boolean swapped = false;
            for(int i = 0; i < n-1-pass;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}


// O(n) case implementation
// imagine only 2 elements are unsorted
// 1 pass to sort them then check bool swapped if true
// stop and return, only 1 pass