package InterviewProgrammig.BasicProngraming;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int ans = 0;
        int rev = 0;
        while (num != 0) {
            rev = num % 10;
            ans = ans * 10 + rev;
            num = num / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 456;
        System.out.println(reverseNumber(num));
    }

}
