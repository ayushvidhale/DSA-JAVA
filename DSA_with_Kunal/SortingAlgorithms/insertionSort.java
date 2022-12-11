package DSA_with_Kunal.SortingAlgorithms;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion Sort...");
        int[] arr = {4,5,2,-67,75,-2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j =i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                } else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;

    }
}
