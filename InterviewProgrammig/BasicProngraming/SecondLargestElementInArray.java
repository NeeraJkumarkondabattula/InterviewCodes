package InterviewProgrammig.BasicProngraming;

public class SecondLargestElementInArray {

    public static void find(int arr[]) {
        int n = arr.length;
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > value1) {
                value2 = value1;
                value1 = arr[i];
            }
            if (arr[i] < value1 && arr[i] > value2) {
                value2 = arr[i];
            }
        }
        System.out.println(value2);
    }

    public static int secondHighest(int arr[]) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        return high2;
    }

    public static void main(String[] args) {
        int arr[] = { 2, -3, -2, 4, -6, -1 };
        find(arr);
        System.out.println(secondHighest(arr));
    }

}
