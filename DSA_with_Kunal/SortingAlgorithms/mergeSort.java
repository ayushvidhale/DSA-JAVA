package DSA_with_Kunal.SortingAlgorithms;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        System.out.println("Merge SORT...");
        int[] arr = {5,4,3,2,1};
        arr = mergeSortFunction(arr);
        System.out.println(Arrays.toString(arr));
    }


    static int[] mergeSortFunction(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left =  mergeSortFunction(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortFunction(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+ second.length];

        int i =0;
        int j = 0;
        int k = 0;
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not complete
        //copy the remaining elements!!

        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[i];
            i++;
            k++;
        }

        return mix;
    }

    // create a function for binary search
    // static int binarySearch(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while(start <= end){
    //         int mid = start + (end - start) / 2;

    //         if(target < arr[mid]){
    //             end = mid - 1;
    //         }else if(target > arr[mid]){
    //             start = mid + 1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }

    //quick sort function
    // static int[] quickSort(int[] arr, int start, int end){
    //     if(start < end){
    //         int partitionIndex = partition(arr, start, end);

    //         quickSort(arr, start, partitionIndex - 1);
    //         quickSort(arr, partitionIndex + 1, end);
    //     }
    //     return arr;
    // }

    // private static int partition(int[] arr, int start, int end) {
    //     int pivot = arr[end];
    //     int i = start - 1;

    //     for(int j = start; j < end; j++){
    //         if(arr[j] <= pivot){
    //             i++;

    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }

    //     int temp = arr[i+1];
    //     arr[i+1] = arr[end];
    //     arr[end] = temp;

    //     return i+1;
    // }
}
