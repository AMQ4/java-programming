package exercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23);
    }
}