package ch3.ex9;

public class Battery {
    double capacity;
    double tempCapacity;

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity +
                ", tempCapacity=" + tempCapacity +
                '}';
    }

    public static void main(String[] args) {
        Battery battery = new Battery(3000);

        battery.drain(1500);

        System.out.println(battery.toString());

        System.out.println(battery.getRemainingCapacity());

        battery.charge();

        System.out.println(battery.toString());
    }

    public Battery(double capacity) {
        this.capacity = capacity;
        tempCapacity=capacity;
    }

    public void drain(double amount)
    {
        tempCapacity-=amount;
    }

    public void charge()
    {
        tempCapacity=capacity;
    }

    public double getRemainingCapacity()
    {
        return tempCapacity/capacity;
    }
}
