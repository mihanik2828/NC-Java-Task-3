package ch3.ex6_7;

public class Person {
    public String name;
    private String friends="";

    public static void main(String[] args) {
        Person person1 = new Person("Tolik");
        Person person2 = new Person("Tolyan");
        Person person3 = new Person("Tolya");
        Person person4 = new Person("Tolya");

        person1.befriend(person2);
        person1.befriend(person3);
        System.out.println(person1.getFriendNames());

        person1.befriend(person4);
        System.out.println(person1.getFriendNames());
        System.out.println(person1.getFriendCount());

        person1.unfriend(person2);
        System.out.println(person1.getFriendNames());
    }


    public Person(String name) {
        this.name = name;
    }

    public void befriend(Person p)
    {
        if(!friends.contains(p.name+" "))
            this.friends+=p.name+" ";
        else
            System.out.println("I know this NAME yet");
    }
    public void unfriend(Person p)
    {
        this.friends=this.friends.replaceAll(p.name+" ","");
    }
    public String getFriendNames()
    {
        return friends;
    }

    public int getFriendCount()
    {
        return friends.split(" ").length;
    }

}
