package challenges.oop.inheritance;

public class Worker {
    private String name, birthDate;
    protected String endDate;

    public Worker(){
        this.name = "no name";
        this.birthDate = this.endDate = "01/01/2023";
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(this.birthDate.substring(6)); // assuming the birthdate is in form of
                                                                            // dd/mm/yyyy
        return currentYear - birthYear;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
