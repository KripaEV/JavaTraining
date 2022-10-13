public class Vehicle {
    String name;
    String size;
    public Vehicle(String name,String size)
    {   this.name=name;
        this.size=size;

    }

    public void move(int speed)
    {
        System.out.println("Vehicle.move() called. Speed="+speed);
    }

    public void steer()
    {
        System.out.println("Vehicle.steer() called");
    }
}
