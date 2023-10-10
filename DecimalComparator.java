public class DecimalComparator {
    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double valOne, double valTwo){
        boolean isEqual = false;
        int firstVal = (int) (valOne * 1000);
        int secondVal = (int) (valTwo * 1000);
        if (firstVal - secondVal == 0){
            isEqual = true;
        }
        return isEqual;
    }
}
