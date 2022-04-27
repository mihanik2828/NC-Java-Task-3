package ch3.ex4;

public class Sheet {
    private double width=841;
    private double height=1189;
    private String name="A";
    private int counter=0;

    public static void main(String[] args) {
        Sheet sheet = new Sheet();

        System.out.println(sheet.toString());
        Sheet sheet1 = sheet.cutInHalf();
        System.out.println(sheet1.toString());
        Sheet sheet2 = sheet1.cutInHalf();
        System.out.println(sheet2.toString());
    }

    public Sheet() {
    }

    private Sheet cutInHalfWidth()
    {
        return new Sheet(this.width/2,this.height,this.counter+1);
    }

    private Sheet cutInHalfHeight()
    {
        return new Sheet(this.width,this.height/2,this.counter+1);
    }

    private Sheet(double width, double height, int counter) {
        this.width = width;
        this.height = height;
        this.counter = counter;
    }

    public Sheet cutInHalf()
    {
        return width>height?this.cutInHalfWidth():this.cutInHalfHeight();
    }

    @Override
    public String toString() {
        return "Sheet{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name+ counter + '\'' +
                '}';
    }
}
