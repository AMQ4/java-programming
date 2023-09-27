package challenges.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a pair of two Double values.
 *
 * @param x The first Double value in the pair.
 * @param y The second Double value in the pair.
 */
record Pair(Double x, Double y) {
    /**
     * Returns a string representation of the Pair in the format "[x, y]".
     *
     * @return A string representation of the Pair.
     */
    public String toString() {
        return String.format("[%f, %f]", x, y);
    }
}

/**
 * An abstract class representing a line with points on it.
 * Classes that extend this class should provide specific implementations for rendering and other behaviors.
 */
public abstract class Line implements Mappable {
    private List<Pair> pointsOnTheLine;

    /**
     * Constructs a Line object with the given list of points.
     *
     * @param pointsOnTheLine The list of points on the line.
     */
    public Line(List<Pair> pointsOnTheLine) {
        this.pointsOnTheLine = pointsOnTheLine;
    }

    /**
     * Constructs an empty Line object with no points initially.
     */
    public Line() {
        this.pointsOnTheLine = new ArrayList<>();
    }

    /**
     * Adds a point to the line if it does not already exist on the line.
     *
     * @param point The point to be added to the line.
     */
    void addPoint(Pair point) {
        if (!pointsOnTheLine.contains(point)) {
            pointsOnTheLine.add(point);
        } else {
            System.out.println(point + " is already on the line.");
        }
    }

    /**
     * Gets the list of points on the line.
     *
     * @return The list of points on the line.
     */
    public List<Pair> getPointsOnTheLine() {
        return pointsOnTheLine;
    }

    /**
     * Returns a string representation of the Line as a list of points.
     *
     * @return A string representation of the Line.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < pointsOnTheLine.size(); ++i) {
            if (i < pointsOnTheLine.size() - 1) {
                result.append(pointsOnTheLine.get(i) + ", ");
            } else {
                result.append(pointsOnTheLine.get(i) + "]");
            }
        }

        if (pointsOnTheLine.isEmpty()) {
            result.append(']');
        }
        return result.toString();
    }
}
