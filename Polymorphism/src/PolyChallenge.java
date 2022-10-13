class Car{
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return getClass().getSimpleName()+" started";
        //retrieves class name
    }

    public String accelerate(){
        return "accelerated";
    }

    public String brake(){
        return "brake applied";
    }
}

class A extends Car{
    public A(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" started";
        //retrieves class name
    }

    @Override
    public String accelerate() {
        return "A accelerated";
    }

    @Override
    public String brake() {
        return "A brake applied";
    }
}

class B extends Car{
    public B(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" started";
        //retrieves class name
    }

    @Override
    public String accelerate() {
        return "B accelerated";
    }

    @Override
    public String brake() {
        return "B brake applied";
    }
}

class C extends Car{
    public C(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" started";
        //retrieves class name
    }

    @Override
    public String accelerate() {
        return "C accelerated";
    }

    @Override
    public String brake() {
        return "C brake applied";
    }
}

public class PolyChallenge {
    public static void main(String[] args){
        Car car=new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        A a=new A(8,"Base car");
        System.out.println(a.startEngine());
        System.out.println(a.accelerate());
        System.out.println(a.brake());

        B b=new B(8,"Base car");
        System.out.println(b.startEngine());
        System.out.println(b.accelerate());
        System.out.println(b.brake());

        C c=new C(8,"Base car");
        System.out.println(c.startEngine());
        System.out.println(c.accelerate());
        System.out.println(c.brake());
    }
}
