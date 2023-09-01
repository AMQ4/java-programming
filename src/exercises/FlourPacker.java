package exercises;

public class FlourPacker {
    /**
     * Determines whether it is possible to pack a given goal amount of flour
     * using the available counts of big and small bags of flour.
     *
     * @param bigCount   The count of big flour bags available (5 kg each).
     * @param smallCount The count of small flour bags available (1 kg each).
     * @param goal       The goal amount of flour to pack.
     * @return True if it's possible to pack the goal amount using the available bags, false otherwise.
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false; // Return false for negative input values
        }
        int currentAmount = goal / 5;
        currentAmount = currentAmount > bigCount ? bigCount * 5 : currentAmount * 5;

        int rest = goal - currentAmount;
        return smallCount >= rest; // Return true if smallCount can cover the remaining flour
    }
}
