public class Main {
    public static void main(String[] args) {
        Dimension dimension =new Dimension(20,20,5);
        Case thecase=new Case("220B","Dell","240",dimension);
        Monitor themonitor=new Monitor("27inch beast","acer",27,new Resolution(2540,1440));
        Motherboard themotherboard=new Motherboard("BJ-200","asus",4,6,"v2.44");
        PC thepc=new PC(thecase,themonitor,themotherboard);

        //composition implementation
//        thepc.getTheMonitor().drawPixelAt(1500,1200,"red");
        //thepc.'monitorobj'(cause that's what is returned-'theMonitor').drawpixelat function
        //composition works this way
//        thepc.getTheMotherboard().loadProgram("Windows 1.0");
//        thepc.getTheCase().pressPowerButton();

        thepc.powerUp();

    }
}