public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number){
        if (number <= 1){
            number = -1;
        } else {
            for (int i = 2; i < number; i++){
                if ((number % i) == 0){
                    number = number / i;
                    i--;

                }
            }

        }
        return number;
    }
}
