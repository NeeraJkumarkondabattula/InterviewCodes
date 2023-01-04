package InterviewProgrammig.BasicProngraming;

public class FibnocciSeries {
    public static int fibnocciSeries(int num) {
        int a = 0;
        int b = 1;
        int c = 1;
        // System.out.print(0 + " ");
        for (int i = 1; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            // System.out.print(a + " ");
        }
        return a;
    }

    private static int fibnocciSeriesR(int num) {
        if (num <= 1) {
            return num;
        }
        return fibnocciSeriesR(num - 1) + fibnocciSeriesR(num - 2);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.print(fibnocciSeries(num) + " ");
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print(fibnocciSeriesR(i) + " ");
        }

    }

}
