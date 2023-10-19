public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number){
        int firstRow = 0;
        int firstCol = 0;
        int lastRow = 0;
        int lastCol = 0;

        for (int i = 1; i <= number; i++){
            firstCol = i;
            lastCol = number;
            for (int j = 1; j <= i; j++){
                System.out.println();
                System.out.print("*");
            }
        }
    }
}
