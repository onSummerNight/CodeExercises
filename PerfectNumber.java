public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        boolean result = false;
        int sum = 0;
        if (number < 1 ){
            result = false;
        } else {
            for (int i = 1; i < number; i++){
                if (number % i == 0){
                    sum = sum + i;
                }
            }
            if (sum == number){
                result = true;
            }
        }
        return result;
    }
}
