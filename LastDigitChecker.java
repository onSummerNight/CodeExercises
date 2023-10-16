public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11,20,111));
    }

    public static boolean hasSameLastDigit(int firstVal, int secondVal, int thirdVal){
        boolean result = false;
        int lastFirst = 0;
        int lastSecond = 0;
        int lastThird = 0;

        if ((firstVal < 10 || firstVal > 1000) || (secondVal < 10 || secondVal > 1000) || (thirdVal < 10 || thirdVal > 1000) ) {
            result = false;
        } else {
            lastFirst = firstVal % 10;
            lastSecond = secondVal % 10;
            lastThird = thirdVal % 10;

            if((lastFirst == lastSecond || lastFirst == lastThird || lastSecond == lastThird)){
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        } else {
            return true;
        }
    }
}
