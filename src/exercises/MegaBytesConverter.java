package exercises;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(
                kiloBytes >= 0
                        ? kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB"
                        : "Invalid Value"
        );
    }
}
