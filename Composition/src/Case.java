public class Case {
    String model;
    String manufacturer;
    String powerSupply;
    private Dimension dim;

    public Case(String model, String manufacturer, String powerSupply, Dimension dim) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dim = dim;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDim() {
        return dim;
    }
}
