package workedexampel9_1;

public abstract class Employee {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public double weeklyPay(int hoursWorked);
}
