class Movie{
    private String name;
    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot";
    }
    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Shark";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence day");
    }
    @Override
    public String plot() {
        return "Aliens";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze runner");
    }
    @Override
    public String plot() {
        return "Maze running";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }
    @Override
    public String plot() {
        return "Darth Vader";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
    //no plot method overriding
    //instead it calls the plot() frm Movie class and executes that
}

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #"+i+":"+movie.getName()+"\n"
                    +"Plot:"+movie.plot()+"\n");
        }
    }

    public static Movie randomMovie(){//to return a random movie
        int randomNo=(int)(Math.random()*5)+1; //random returns double value
        //therefore type cast to int
        //random generates no btn 0 and 1
        //multiply by 5 to get whole no 0-4
        //add 1 to get options from 1-5
        System.out.println("Random no generated:"+randomNo);
        switch(randomNo){
            case 1:return new Jaws();
            case 2:return new IndependenceDay();
            case 3:return new MazeRunner();
            case 4:return new StarWars();
            case 5:return new Forgettable();
            default:return null;
        }
    }
}

