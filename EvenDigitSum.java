public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        int digit = 0;
        int result = 0;

        if (number < 0) {
            result = -1;
        } else {
            while (number > 0) {
                digit =  (number % 10);
                if (digit % 2 == 0) {
                    result = result + digit;
                }
                number = number / 10;
            }
        }
        return result;
    }

}
