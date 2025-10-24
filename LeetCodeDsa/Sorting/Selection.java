package LeetCodeDsa.Sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,9};
        print(arr);
        SelectionSort(arr);
        print(arr);

    }
    public static void print(int[] arr){
        for(int num : arr){
            System.out.println(num + " ");
        }
    }

    public static void SelectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}


//Notes
// Repeatedly select the smallest element
// and place at the correct position

//array is divided into 2 parts
//sorted(grows from the left)
//unsorted(shrinks from the right)

// unsorted array [64,25,12,22,11]
//pass     find min     swap      result
// 1       min = 11  swap(64,11)  [11,25,12,22,64]
// 2       min = 12  swap(25,12)  [11,12,25,22,64]
// 3       min = 22  swap(25,22)  [11,12,22,25,64]
// 4       min = 25  already correct
// 5       done      sorted

// best O(n^2) -> always scans unsorted part
// avg O(n^2)  -> same
// worst O(n^2) -> same
// space O(1) -> in place

