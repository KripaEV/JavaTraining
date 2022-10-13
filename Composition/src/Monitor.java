public class Monitor {
    String model;
    String manufacturer;
    int size;
    private Resolution nativeRes;
    //monitor class *has a* resolution as resolution class is part of monitor class
    //resolution is a component of monitor and resolution cant exist without monitor -- composition

    public Monitor(String model, String manufacturer, int size, Resolution nativeRes) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeRes = nativeRes;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+x +","+y+" with color "+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeRes() {
        return nativeRes;
    }
}
