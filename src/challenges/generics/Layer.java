package challenges.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a layer that contains elements that implement the {@link Mappable} interface.
 * A layer is a collection of elements that can be rendered as strings.
 *
 * @param <E> The type of elements that can be added to the layer, which must implement the {@link Mappable} interface.
 */
public class Layer<E extends Mappable> {
    private List<E> mappableElements;

    /**
     * Constructs a layer with the given list of mappable elements.
     *
     * @param mappableElements The list of mappable elements to include in the layer.
     */
    public Layer(List<E> mappableElements) {
        this.mappableElements = mappableElements;
    }

    /**
     * Constructs an empty layer with no initial mappable elements.
     */
    public Layer() {
        this.mappableElements = new ArrayList<>();
    }

    /**
     * Adds an element to the layer.
     *
     * @param element The mappable element to be added to the layer.
     */
    public void addElement(E element) {
        mappableElements.add(element);
    }

    /**
     * Renders all elements in the layer by calling their {@link Mappable#render()} method.
     * Each rendered element is printed to the console.
     */
    public void renderElements() {
        for (Mappable mappable : mappableElements) {
            System.out.println(mappable.render());
        }
    }
}
