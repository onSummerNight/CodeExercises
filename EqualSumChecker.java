public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int firstVal, int secondVal, int sumValue){
        if (firstVal + secondVal == sumValue){
            return true;
        } else {
            return false;
        }
    }
}
