public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        double resultDouble;
        if (kilometersPerHour < 0){
            resultDouble = -1;
        } else {
            resultDouble = kilometersPerHour / 1.609;
        }
        long roundMiles = Math.round(resultDouble);

        return roundMiles;
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

    }
}
