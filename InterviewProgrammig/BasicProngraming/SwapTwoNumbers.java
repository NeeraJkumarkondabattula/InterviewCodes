package InterviewProgrammig.BasicProngraming;

public class SwapTwoNumbers {

    public static void swapTwoNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void swapTwoNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        int a = 33;
        int b = 22;
        swapTwoNumbers(a, b);
    }

}
