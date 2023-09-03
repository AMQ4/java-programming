package exercises.oop.inheritance;

public class Person {
    private String firstName, lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age > 100 || age < 0 ? 0 : age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        String fullName = this.firstName.isBlank() ? this.lastName.isBlank() ? "" :
                this.lastName : this.lastName.isBlank() ? this.firstName : this.firstName + " " + this.lastName;
        return fullName;
    }
}
