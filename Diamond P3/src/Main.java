import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(2);
    World.setSize(13,13);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(13,7,West,25);
		
    // examples of commands you can invoke on a Robot
       r.putBeeper();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper(); 
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper(); 
       r.turnLeft();
       r.turnLeft();
       r.turnLeft();
       r.move();
       r.turnLeft();
       r.move();
       r.putBeeper();
       r.move();

       
       

       


         // move one step in the direction it is facing

  }
}