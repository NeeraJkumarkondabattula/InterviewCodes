package InterviewProgrammig.BasicProngraming;

public class FactorialOfNumber {

    public static int factoriaOfNumber(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int factorialOfNumberR(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorialOfNumberR(num - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(factorialOfNumberR(num));

    }

}
