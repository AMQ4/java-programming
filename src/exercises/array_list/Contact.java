package exercises.array_list;

/**
 * The Contact class represents a contact with a name and phone number.
 */
public class Contact {
    private String name, phoneNumber;

    /**
     * Constructs a new Contact object with the specified name and phone number.
     *
     * @param name        The name of the contact.
     * @param phoneNumber The phone number of the contact.
     */
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the name of the contact.
     *
     * @return The name of the contact.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the phone number of the contact.
     *
     * @return The phone number of the contact.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Creates a new Contact object with the specified name and phone number.
     *
     * @param name        The name of the contact.
     * @param phoneNumber The phone number of the contact.
     * @return A new Contact object.
     */
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
