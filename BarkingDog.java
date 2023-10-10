public class BarkingDog {
    public static void main(String[] args) {

        shouldWakeUp(true,1);
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){

        if (isBarking && (( hourOfDay < 8 && hourOfDay >= 0) || hourOfDay == 23)){
            return true;
        } else {
            return false;
        }

    }
}
