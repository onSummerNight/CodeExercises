import java.awt.*;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int lastDigit = number % 10;

        while (number > 9){
            number = number / 10;
        }

        return lastDigit + number;
    }

    /*public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int secondDigit = 0;
        int stored = 0;
        int result = 0;

        stored = number;
        if (stored < 0){
            return -1;
        } else if ((stored >= 0 ) && (stored <10)){
            firstDigit = stored;
            secondDigit = firstDigit;
        }
        else {
            while (true){
                if (stored < 10){
                    firstDigit = firstDigit + stored;
                    break;
                } else {
                    secondDigit = number % 10;
                    stored = stored / 10;
                }
            }
        }
        result = firstDigit + secondDigit;
        return result;
    }*/
}
