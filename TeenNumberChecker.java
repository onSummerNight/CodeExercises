public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(12,90,80);
        isTeen(19);
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        boolean hasTeen = false;
        if ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <=19) || (age3 >= 13 && age3 <=19)) {
            hasTeen = true;
        } else {
            hasTeen = false;
        }
        return hasTeen;
    }

    public static boolean isTeen(int ageNumber){
        boolean isTeen = false;
        if(ageNumber >= 13 && ageNumber <=19) {
            isTeen = true;
        } else {
            isTeen = false;
        }
        return isTeen;

    }
}
