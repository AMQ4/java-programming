package exercises.oop.polymorphism;
/**
 * The `Printer` class represents a printer with toner level, duplex printing capability, and a count of printed pages.
 */
public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    /**
     * Constructs a new `Printer` object with the specified initial toner level and duplex printing capability.
     *
     * @param tonerLevel The initial toner level. Must be between 0 and 100 (inclusive).
     * @param isDuplex   Indicates whether the printer supports duplex printing.
     */
    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel > 100 || tonerLevel < 0 ? -1 : tonerLevel;
        this.duplex = isDuplex;
    }

    /**
     * Constructs a new `Printer` object with default settings (toner level at 0 and no duplex capability).
     */
    public Printer() {
        tonerLevel = 0;
        duplex = false;
    }

    /**
     * Adds toner to the printer, increasing the toner level.
     *
     * @param tonerAmount The amount of toner to add. Must be within the range [0, 100].
     * @return The updated toner level after adding toner, or -1 if the toner level would go out of range.
     */
    public int addToner(int tonerAmount) {
        int totalToner = tonerLevel + tonerAmount;

        if (totalToner > 100 || totalToner < 0) {
            return -1;
        }

        tonerLevel = totalToner;
        return tonerLevel;
    }

    /**
     * Prints the specified number of pages, considering duplex printing if enabled.
     *
     * @param noPages The number of pages to print.
     * @return The actual number of pages that will be printed, considering duplex printing.
     */
    public int printPages(int noPages) {
        int noPagesWillBePrintedOut;

        if (duplex) {
            System.out.println("It is a duplex printer.");
            noPagesWillBePrintedOut = (int) Math.ceil(noPages / 2.0);
        } else {
            noPagesWillBePrintedOut = noPages;
        }

        pagesPrinted += noPagesWillBePrintedOut;
        return noPagesWillBePrintedOut;
    }

    /**
     * Gets the total number of pages printed by the printer.
     *
     * @return The total number of pages printed.
     */
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
