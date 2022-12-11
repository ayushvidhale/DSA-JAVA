package DSA_with_Kunal.SearchingAlgorithms;

class binarySearch{
    public static void main(String[] args) {

        System.out.println("Hello world!!");
        int [] arr = {-18,-2,0,5,10,20,30};
        int target = 5;

        int answer = binarySearchFunction(arr, target);
        System.out.println(answer);
    }

    static int binarySearchFunction(int[] nums, int target ){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){

            int mid = start + (end-start)/2;

            if(target< nums[mid]){
                end = mid -1;
            }else if (target>nums[mid]){
                start = mid +1;

            }else{
                return mid;
            }

        }
        return -1;
    }


}