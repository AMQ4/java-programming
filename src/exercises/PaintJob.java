package exercises;

public class PaintJob {
    /**
     * Calculates the number of paint buckets needed to paint a wall with the given dimensions.
     * Takes into account extra paint buckets.
     *
     * @param width         The width of the wall.
     * @param height        The height of the wall.
     * @param areaPerBucket The area that can be covered by a single paint bucket.
     * @param extraBuckets  The number of extra paint buckets available.
     * @return The number of paint buckets needed for the wall, minus the extra buckets.
     *         Returns -1 if any input value is non-positive or if extraBuckets is negative.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; // Return -1 for invalid input values
        }
        return getBucketCount(width, height, areaPerBucket) - extraBuckets; // Subtract extra buckets from total
    }

    /**
     * Calculates the number of paint buckets needed to paint an area with the given dimensions.
     *
     * @param area         The area to be painted.
     * @param areaPerBucket The area that can be covered by a single paint bucket.
     * @return The number of paint buckets needed to cover the area.
     *         Returns -1 if either input value is non-positive.
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1; // Return -1 for invalid input values
        }
        return (int) Math.ceil(area / areaPerBucket); // Calculate and return the required number of buckets
    }

    /**
     * Calculates the number of paint buckets needed to paint a wall with the given dimensions.
     *
     * @param width         The width of the wall.
     * @param height        The height of the wall.
     * @param areaPerBucket The area that can be covered by a single paint bucket.
     * @return The number of paint buckets needed for the wall.
     *         Returns -1 if any input value is non-positive.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1; // Return -1 for invalid input values
        }
        return getBucketCount(width * height, areaPerBucket); // Calculate buckets required based on wall area
    }
}
