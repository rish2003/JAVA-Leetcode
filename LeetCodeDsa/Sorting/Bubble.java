package LeetCodeDsa.Sorting;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {89,46,58,66,77,12,13,21,33};
        print(arr);
        BubbleSort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int pass = 0; pass < n-1; pass++){
            for(int i = 0; i < n-1-pass; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}


//bubble sort is stable
//think of big bubble rising and floating to end
//only swap when left elem is strictly greater
//better for small sized arrays
//

// time complexity -> worst O(n^2) reversed array
// average case -> O(n^2)
// best case -> O(n) already almost sorted -> asked in caterpillar
// space -> O(1)

//dry run -> [5,2,9,1,5]
// pass 1
// compare 5 & 2 -> swap
// compare 5 & 9 -> no swap
// compare 9 & 1 -> swap
// compare 9 & 5 -> swap

//pass 2
// compare 2 & 5 -> no swap
// compare 5 & 1 -> swap
// compare 5 & 5 -> no swap

//pass 3
//compare 2 & 1 -> swap
//Sorted

