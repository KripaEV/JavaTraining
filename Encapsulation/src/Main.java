public class Main {
    public static void main(String[] args) {
//        Player player=new Player(); //default constructor with no para
//        player.name="Abc";
//        player.health=20;
//        player.weapon="Sword";

        /*this demonstrates how we can assign and control the values of the
        stats which can really affect the 'game'. These are things that we shdlnt give
        control to anyone or else it dangerous (not really), hence encapsulation
        int damage=10;
        player.loseHealth(10);
        System.out.println("Remaining health= "+player.healthRemaining());

        damage=12;
        player.loseHealth(12);
        System.out.println("Remaining health= "+player.healthRemaining());
        */

        EnhancedPlayer player1=new EnhancedPlayer("Abc",50,"sword");
        System.out.println("Initial health:"+player1.getHealth());
    }
}