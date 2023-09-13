package exercises.array_list;

import java.util.ArrayList;

/**
 * Represents a mobile phone with a list of contacts.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    /**
     * Constructs a MobilePhone object with the given phone number.
     *
     * @param myNumber The phone number associated with this mobile phone.
     */
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    /**
     * Adds a new contact to the mobile phone's contact list.
     *
     * @param newContact The Contact object to be added.
     * @return true if the contact was added successfully, false if the contact already exists.
     */
    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact) == -1) {
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    /**
     * Updates an existing contact with new contact information.
     *
     * @param oldContact The old Contact object to be updated.
     * @param newContact The new Contact object with updated information.
     * @return true if the update was successful, false if the old contact was not found.
     */
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int indexOfOldContact = -1;

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(oldContact.getName())) {
                indexOfOldContact = i;
                break;
            }
        }

        if (indexOfOldContact != -1) {
            myContacts.set(indexOfOldContact, newContact);
        }

        return indexOfOldContact != -1;
    }

    /**
     * Removes a contact from the mobile phone's contact list.
     *
     * @param contactToRemove The Contact object to be removed.
     * @return true if the contact was removed successfully, false if the contact was not found.
     */
    public boolean removeContact(Contact contactToRemove) {
        int indexOfTheContactToRemove = -1;

        for (int i = 0; i < myContacts.size(); i++) {
            if (contactToRemove.getName().equals(myContacts.get(i).getName())) {
                indexOfTheContactToRemove = i;
                break;
            }
        }

        if (indexOfTheContactToRemove != -1) {
            myContacts.remove(indexOfTheContactToRemove);
        }
        return indexOfTheContactToRemove != -1;
    }

    /**
     * Finds a contact in the mobile phone's contact list by name.
     *
     * @param contactToSearch The name of the contact to search for.
     * @return The index of the contact in the list if found, or -1 if not found.
     */
    private int findContact(Contact contactToSearch) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contactToSearch.getName().equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds a contact in the mobile phone's contact list by name.
     *
     * @param name The name of the contact to search for.
     * @return The index of the contact in the list if found, or -1 if not found.
     */
    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Queries a contact in the mobile phone's contact list by name.
     *
     * @param nameContactToQuery The name of the contact to query.
     * @return The Contact object if found, or null if not found.
     */
    public Contact queryContact(String nameContactToQuery) {
        int indexOfNameContactToQuery = findContact(nameContactToQuery);
        return indexOfNameContactToQuery == -1 ? null : myContacts.get(indexOfNameContactToQuery);
    }

    /**
     * Prints the list of contacts stored in the mobile phone.
     */
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
