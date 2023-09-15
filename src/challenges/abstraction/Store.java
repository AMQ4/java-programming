package challenges.abstraction;

/**
 * A class representing a store that manages orders and products for sale.
 */
public class Store {
    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem();
        orderItem.addItem(new Phone("elctro", "i Phone 16", 100));
        listProductsOfOrder(orderItem);
        printSalesReceipt(orderItem);
    }

    /**
     * Displays details of a product for sale.
     *
     * @param product The product to display details for.
     */
    public static void showDetails(ProductForSale product) {
        product.showDetails();
    }

    /**
     * Adds a product to an order.
     *
     * @param product The product to add to the order.
     * @param order   The order to add the product to.
     */
    public static void addItem(ProductForSale product, OrderItem order) {
        order.addItem(product);
    }

    /**
     * Lists the types of products in an order.
     *
     * @param order The order to list products from.
     */
    public static void listProductsOfOrder(OrderItem order) {
        for (ProductForSale product : order) {
            System.out.println(product.getType());
        }
    }

    /**
     * Prints a sales receipt for an order, including product types and total price.
     *
     * @param order The order to print a sales receipt for.
     */
    public static void printSalesReceipt(OrderItem order) {
        double totalPrice = 0.0;
        for (ProductForSale product : order) {
            System.out.printf("%-15s%.2f%n", product.getType(), product.getPrice());
            totalPrice += product.getPrice();
        }
        System.out.println("-".repeat(20));
        System.out.printf("%-15s%.2f%n", "Total Price:", totalPrice);
    }
}
