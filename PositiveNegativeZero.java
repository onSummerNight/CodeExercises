public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-1);
        checkNumber(0);
    }
    public static void checkNumber(int numCheck) {
        String result = "zero";
        if (numCheck > 0){
            result = "positive";
        } else if (numCheck < 0){
            result = "negative";
        }
        System.out.println(result);
    }
}
