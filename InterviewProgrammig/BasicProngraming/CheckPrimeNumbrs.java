package InterviewProgrammig.BasicProngraming;

public class CheckPrimeNumbrs {
    public static int checkPrimeNumbers(int num) {
        int sum = 0;
        for (int j = 1; j < num; j++) {
            int count = 0;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count > 0) {
                // System.out.println(j + " " + "Not Prime");
            } else {
                sum = sum + j;
                System.out.print(j + " ");

            }
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(checkPrimeNumbers(num));
    }

}
