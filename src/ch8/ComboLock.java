package ch8;

public class ComboLock {
    String rightStrategy="";
    String tempStrategy="0 0 0 ";
    int tempDial=0;

    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(1,2,39);

        System.out.println(comboLock.toString());

        comboLock.turnRight(1);
        System.out.println(comboLock.toString());
        comboLock.turnRight(1);
        System.out.println(comboLock.toString());
        comboLock.turnLeft(3);
        System.out.println(comboLock.toString());

        comboLock.open();

        System.out.println(comboLock.toString());

        comboLock.reset();

        System.out.println(comboLock.toString());

        comboLock.open();
    }

    public ComboLock(int secret1, int secret2, int secret3) {
        rightStrategy += secret1+" ";
        rightStrategy += secret2+" ";
        rightStrategy += secret3+" ";
    }
    public void reset() {
        tempStrategy="0 0 0 ";
        tempDial=0;
    }

    public void turnLeft(int ticks) {
        tempDial= (40 + tempDial - ticks) % 40;
        tempStrategy = (tempStrategy + tempDial+" ").substring(tempStrategy.indexOf(" ")+1);
    }
    public void turnRight(int ticks) {
        tempDial= (tempDial + ticks) % 40;
        tempStrategy = (tempStrategy + tempDial + " ").substring(tempStrategy.indexOf(" ")+1);
    }
    public boolean open() {
        boolean result=rightStrategy.equals(tempStrategy);
        System.out.println(result? "It`s open" : "Don`t open , bad combination");
        return result;
    }

    @Override
    public String toString() {
        return "ComboLock{" +
                "rightStrategy='" + rightStrategy + '\'' +
                ", tempStrategy='" + tempStrategy + '\'' +
                ", tempDial=" + tempDial +
                '}';
    }
}
