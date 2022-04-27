package workedexampel9_1;

public class HourlyEmployee extends Employee{

    private double wagePerHour;

    public HourlyEmployee(String name,double wagePerHour) {
        this.name=name;
        this.wagePerHour = wagePerHour;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        return hoursWorked<=40? hoursWorked*wagePerHour:wagePerHour*hoursWorked+1.5*wagePerHour*(hoursWorked%40);
    }
}
