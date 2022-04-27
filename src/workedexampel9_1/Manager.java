package workedexampel9_1;

public class Manager extends  SalariedEmployee{

    private double bonus;

    public Manager(String name, double salary , double bonus) {
        super(name, salary);
        this.bonus = bonus/100.0+1;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        return super.weeklyPay(hoursWorked)*bonus;
    }
}
