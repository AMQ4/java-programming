package challenges.generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a River object named "A" with a list of points representing its path.
        River river = new River("A", List.of(new Pair(1.1, 3.3), new Pair(3.3, 5.5),
                new Pair(5.5, 7.7)));

        // Create a Park object named "B" with specific latitude and longitude coordinates.
        Park park = new Park("B", 10.1, 23.4);

        // Create a Layer of Mappable elements and initialize it with the River and Park objects.
        Layer<Mappable> layer = new Layer<>(List.of(river, park));

        // Render and display the elements in the layer.
        layer.renderElements();
    }

}