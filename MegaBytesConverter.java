public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int toMegaByte = kiloBytes / 1024;
            int remainByte = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + toMegaByte + " MB and " + remainByte + " KB");
        }
    }
}
