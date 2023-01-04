package InterviewProgrammig.BasicProngraming;

public class CheckPalindromeString {
    public static boolean checkPalindromeString(String str) {
        String ans = "";
        String org = str;
        for (int i = 0; i < str.length(); i++) {
            char rev = str.charAt(i);
            ans = rev + ans;
        }
        return ans.equals(org);
    }

    public static void main(String[] args) {
        String str = "neeneen";
        System.out.println(checkPalindromeString(str));

    }
}
