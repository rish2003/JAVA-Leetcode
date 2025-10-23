package LeetCodeDsa.Sorting;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        insertionSortTrace(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int x: arr){
            System.out.println(x + " ");
            System.out.println();
        }
    }

    public static void insertionSortTrace(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

//            System.out.println("\nInserting " + key);
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
//              print(arr);
            }
            arr[j+1] = key;
//            print(arr);
        }

    }
}



//Notes
// stable algorithm because we only shift
//elements if they are greater not equal
// To use when array is almost already sorted

//Time complexities
//Best -> O(n) for almost sorted array
//Average -> O(n^2)
//Worst -> O(n^2)

//DRY RUN on int[] arr = {5,2,4,6,1,3}
//Step        Action               //Result
//1       Take 2, insert bw 2,5    [2,5],4,6,1,3
//2       Take 4, insert bw 2,5    [2,4,5],6,1,3
//3       Take 6, already greater  [2,4,5,6],1,3
//4       Take 1, insert at begin  [1,2,4,5,6],3
//5       Take 3, insert bw 2,4    [1,2,3,4,5,6]

//Imagine Rearraging Cards in your hand