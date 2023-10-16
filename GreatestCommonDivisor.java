public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int result = 0;
        int upto = 0;

        if (first < 10 || second < 10 ){
            result = -1;
        } else {
            if ( first > second) {
                upto = first;
            } else {
                upto = second;
            }
            for (int i = 1; i <= upto; i++){
                if ( (first % i == 0) & (second % i == 0)) {
                        result = i;
                    }
                }

            }
        return result;
        }

    }

