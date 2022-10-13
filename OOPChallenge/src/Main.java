import java.security.PrivateKey;

class Hamburger {
    private String breadRollType;
    private String meatType;
    private String name;
    private double price;

    private String add1Name;
    private double add1Price;
    private String add2Name;
    private double add2Price;
    private String add3Name;
    private double add3Price;
    private String add4Name;
    private double add4Price;

    public Hamburger(String breadRollType, String meatType, String name, double price) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.name = name;
        this.price = price;
    }
    public void hamburgerAddition1(String name, double price){
        this.add1Name=name;
        this.add1Price=price;
    }
    public void hamburgerAddition2(String name, double price){
        this.add2Name=name;
        this.add2Price=price;
    }
    public void hamburgerAddition3(String name, double price){
        this.add3Name=name;
        this.add3Price=price;
    }
    public void hamburgerAddition4(String name, double price){
        this.add4Name=name;
        this.add4Price=price;
    }
    public double calculatePrice(){
        double hamburgerPrice=this.price;
        System.out.println(this.name+" hamburger on a "+this.breadRollType+"roll with "+this.meatType+ ".\nPrice:"+this.price);
        if(this.add1Name!=null){
            hamburgerPrice+=this.add1Price;
            System.out.println("added "+add1Name+". Additional price:"+add1Price);
        }
        if(this.add2Name!=null){
            hamburgerPrice+=this.add2Price;
            System.out.println("added "+add2Name+". Additional price:"+add2Price);
        }
        if(this.add3Name!=null){
            hamburgerPrice+=this.add3Price;
            System.out.println("added "+add3Name+". Additional price:"+add3Price);
        }
        if(this.add4Name!=null){
            hamburgerPrice+=this.add4Price;
            System.out.println("added "+add4Name+". Additional price:"+add4Price);
        }
        return hamburgerPrice;
    }

}
class HealthyBurger extends Hamburger {
    private double price;
    private String add5Name;
    private double add5Price;
    private String add6Name;
    private double add6Price;

    public HealthyBurger(String meatType, double price) {
        super("Brown Rye", meatType, "Healthy", price);

    }

    public void hamburgerAddition5(String name, double price){
        this.add5Name=name;
        this.add5Price=price;
    }

    public void hamburgerAddition6(String name, double price){
        this.add6Name=name;
        this.add6Price=price;
    }

    @Override
    public double calculatePrice() {
        double hamburgerPrice=super.calculatePrice();
        if(this.add5Name!=null){
            hamburgerPrice+=this.add5Price;
            System.out.println("added "+add5Name+". Additional price:"+add5Price);
        }
        if(this.add6Name!=null){
            hamburgerPrice+=this.add6Price;
            System.out.println("added "+add6Name+". Additional price:"+add6Price);
        }
        return hamburgerPrice;
    }
}

class DeluxeBurger extends Hamburger {
    private String add7Name;
    private double add7Price;
    private String add8Name;
    private double add8Price;

    public DeluxeBurger(String breadRollType, String meatType, String name, double price) {
        super(breadRollType, meatType, name, price);
    }
    public void deluxeAddition1(String name, double price){
        this.add7Name=name;
        this.add7Price=price;
    }
    public void deluxeAddition2(String name, double price){
        this.add8Name=name;
        this.add8Price=price;
    }

    @Override
    public double calculatePrice() {
        double hamburgerPrice=super.calculatePrice();
        if(this.add7Name=="chips"){
            hamburgerPrice+=this.add7Price;
            System.out.println("Added "+add7Name+". Additional price:"+add7Price);
        }
        /*else */if(this.add8Name=="fish") {
            hamburgerPrice += this.add8Price;
            System.out.println("Added " + add8Name + ". Additional price:" + add8Price);
        }
//        else if(this.add7Name!="chips"||this.add8Name!="fish"){
//            System.out.println("Can't add to order");
//        }
//        else{
//            return hamburgerPrice;
//        }
        return hamburgerPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Hamburger burger=new Hamburger("White","sausage","Basic",3.33);
        HealthyBurger hBurger=new HealthyBurger("Bacon",20);
        DeluxeBurger dBurger=new DeluxeBurger("Cinnamon","Salmon","Deluxe",5);

        burger.hamburgerAddition1("lettuce",1);
        burger.hamburgerAddition2("tomato",1);
        double totalPrice= burger.calculatePrice();
        System.out.println("Total Price:"+totalPrice);

        //healthy burger
        //System.out.println("Total Price:"+hBurger.calculatePrice());
        hBurger.hamburgerAddition5("Cheese",2);
        System.out.println("Total Price:"+hBurger.calculatePrice());

        //Deluxe burger
        //System.out.println("Total Price:"+dBurger.calculatePrice());
        dBurger.deluxeAddition1("chips",0.75);
        System.out.println("Total Price:"+dBurger.calculatePrice());
    }
}