package challenges.abstraction;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents an order item that can contain a list of products for sale.
 */
public class OrderItem implements Iterable<ProductForSale> {
    private ArrayList<ProductForSale> products;
    private int quantity;

    /**
     * Initializes a new instance of the OrderItem class.
     * The quantity is initially set to zero, and the product list is created.
     */
    public OrderItem() {
        quantity = 0;
        products = new ArrayList<>();
    }

    /**
     * Adds a product to the order item.
     *
     * @param product The product to add to the order item.
     */
    public void addItem(ProductForSale product) {
        if (product == null) {
            System.out.printf("You can't add a null product.");
            return;
        }
        products.add(product);
        ++quantity;
    }

    /**
     * Returns an iterator over the products in the order item.
     *
     * @return An iterator over the products in the order item.
     */
    @Override
    public Iterator<ProductForSale> iterator() {
        return new OrderItemIterator();
    }

    private class OrderItemIterator implements Iterator<ProductForSale> {
        private int currentIndex = 0;

        /**
         * Checks if there are more products to iterate over.
         *
         * @return true if there are more products to iterate; false otherwise.
         */
        @Override
        public boolean hasNext() {
            return currentIndex < products.size();
        }

        /**
         * Returns the next product in the iteration.
         *
         * @return The next product in the iteration.
         * @throws java.util.NoSuchElementException if there are no more products to iterate.
         */
        @Override
        public ProductForSale next() {
            if (hasNext()) {
                return products.get(currentIndex++);
            } else {
                throw new java.util.NoSuchElementException();
            }
        }
    }
}
