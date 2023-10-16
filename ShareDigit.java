public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,42));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum){
        boolean isShared = false;
        int firstL = 0;
        int secondL = 0;

        if ((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
            isShared = false;
        } else {

            firstL = firstNum % 10;
            secondL = secondNum % 10;

            while (firstNum > 10) {
                firstNum = firstNum / 10;
                secondNum = secondNum / 10;
            }


            if (((firstNum == secondNum) || (firstNum == secondL)) || ((firstL == secondNum) || (firstL == secondL))) {
                isShared = true;
            } else {
                isShared = false;
            }

        }
        return isShared;
    }
}
