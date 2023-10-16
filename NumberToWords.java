import java.awt.*;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(10));
        numberToWords(100);
    }

    public static void numberToWords(int number){
        int result = 0;
        int reverse = reverse(number);
        int digit = 0;
        if (number < 0 ){
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < getDigitCount(number); i++) {
                digit = reverse % 10;
                switch (digit){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.print("Invalid Value");
                        break;
                }
                reverse = reverse / 10;
            }
        }
    }

    public static int reverse(int number){
        int result = 0;
        int reverseResult = 0;


        while ( number > 0  || number < 0){
            result = number % 10;
            number = number / 10;
            reverseResult = reverseResult * 10;
            reverseResult = reverseResult + result;
        }
        return  reverseResult;
    }

    public static int getDigitCount(int number){
        int result = 1;
        int count = 0;

        if (number < 0){
            result = -1;
        } else {
            while (number > 9){
                result++;
                number = number / 10;
            }
        }
        return result;
    }
}
