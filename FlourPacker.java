public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean result = false;

        while (bigCount > 0 && goal >= 5){
            goal = goal - 5;
            bigCount--;
        }

        if (smallCount >= goal){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
