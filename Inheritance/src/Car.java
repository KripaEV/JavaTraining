public class Car extends Vehicle{
    int wheels;
    int doors;
    int gears;
    boolean isManual;
    int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): "+this.currentGear);
    }
}
