package InterviewProgrammig.BasicProngraming;

public class CheckOvelPresentInString {
    public static boolean checkOvelPresnet(String str) {
        String arr[] = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
        for (String index : arr) {
            if (str.contains(index)) {
                return true;
            }
        }
        return false;
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        String str = "gwrsf";
        System.out.println(checkOvelPresnet(str));
        System.out.println(stringContainsVowels(str));
    }

}
