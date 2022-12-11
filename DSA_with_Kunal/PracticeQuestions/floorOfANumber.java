package DSA_with_Kunal.PracticeQuestions;

public class floorOfANumber {
    public static void main(String[] args) {
        int[] arr = { -18, -2, 0, 5, 10, 20, 30 };
        int target = 30;
        System.out.println(floorOfANumberFunction(arr, target));

    }

    static int floorOfANumberFunction(int[] arr, int floorOfANumber){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (floorOfANumber < arr[mid]) {
                end = mid - 1;
            } else if (floorOfANumber > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }

        if (end >= arr.length -1) {
            return -1;
        }
        return end;
    }
}
