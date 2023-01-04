package InterviewProgrammig.BasicProngraming;

public class RemoveSpaceFromString {

    public static String removeSpaceFromString(String str) {
        StringBuilder ans = new StringBuilder();
        char s[] = str.toCharArray();
        for (char index : s) {
            if (index != ' ') {
                ans.append(index);
            }
        }
        return ans.toString();
    }

    public static String startAndEndSpaces(String str) {
        return str.strip();
    }

    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String str = "hai my name is neeraj kumar";
        System.out.println(removeWhiteSpaces(str));
        System.out.println(removeSpaceFromString(str));
        String str1 = "     hello    ";
        System.out.println(startAndEndSpaces(str1));

    }
}
