package DSA_with_Kunal.PracticeQuestions;

public class ceilingOfANumber {
    public static void main(String[] args) {
        int[] arr = { -18, -2, 0, 5, 10, 20, 30 };
        int target = 324;

        int answer = ceilingOfANumberFunction(arr, target);
        System.out.println(answer);
    }

    static int ceilingOfANumberFunction(int[] arr, int ceilingOfANumber ){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){

            int mid = start + (end-start)/2;

            if(ceilingOfANumber< arr[mid]){
                end = mid -1;
            }else if (ceilingOfANumber>arr[mid]){
                start = mid +1;

            }else{
                return mid;
            }

        }

        if(start>arr.length-1){
            return -1;
        }
        return start;
    }
}