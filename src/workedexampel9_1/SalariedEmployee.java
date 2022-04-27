package workedexampel9_1;

public class SalariedEmployee extends Employee{

    protected double salary;

    public SalariedEmployee(String name,double salary) {
        this.salary = salary;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        return salary;
    }
}
