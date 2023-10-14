
public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(isOdd(3));

    }

    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        } else {
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }

    }

    public static int sumOdd(int start, int end){
        int i = 0;

        int result = 0;
        if ((start < 0) || (end < 0)) {
            result = -1;
        } else if ( end < start) {
            result = -1;
        } else {
        for (i = start;i <= end; i++) {
            if (isOdd(i)){
                result = result + i;
            }
        }

        }
        return  result;
    }
}
