package InterviewProgrammig.BasicProngraming;

public class ReverseString {
    public static String reverseString(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char rev = str.charAt(i);
            ans = rev + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "neerajkumar";
        System.out.println(reverseString(str));
    }
}
