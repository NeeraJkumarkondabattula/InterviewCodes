package InterviewProgrammig.SecondLevelProgramming;

public class BinarySearch {
    public static int binarySearch(int arr[], int x) {
        int start = 0;
        int index = -1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (arr[mid] == x) {
                index = mid;
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 7, 8 };
        System.out.println(binarySearch(arr, 11));
    }

}
