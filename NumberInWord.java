public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(2);
    }

    public static void printNumberInWord(int number){
        String theWord ;
        switch (number){
            case 0 :
                theWord = "ZERO";
                break;
            case 1 :
                theWord = "ONE";
                break;
            case 2 :
                theWord = "TWO";
                break;
            case 3 :
                theWord = "THREE";
                break;
            case 4 :
                theWord = "FOUR";
                break;
            case 5 :
                theWord = "FIVE";
                break;
            case 6 :
                theWord = "SIX";
                break;
            case 7 :
                theWord = "SEVEN";
                break;
            case 8 :
                theWord = "EIGHT";
                break;
            case 9 :
                theWord = "NINE";
                break;
            default :
                theWord = "OTHER";
                break;
        }
        System.out.println(theWord);
    }
}
