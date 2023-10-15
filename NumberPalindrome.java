import javax.print.attribute.standard.PresentationDirection;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(202);
    }

    public static boolean isPalindrome(int number){
        if (number < 0){
            number = number * -1;
        }

        int reverse = 0;
        int stored = number;
        int lastdigit = 0;


        while (stored > 0){
            lastdigit = stored % 10;
            reverse = reverse * 10;
            reverse = reverse + lastdigit;
            stored = stored / 10;

        }

        if (number == reverse){
            return true;
        } else {
            return false;
        }

    }
}
