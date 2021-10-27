package grupo9JaraYCesar;
import robocode.*;

public class CornerStrategy implements CombatStrategy {

    public static final CombatStrategy ESTRATEGIA = new CornerStrategy();

    private Integer gunIncrement = 3;
    private boolean first = true;
    private boolean readyRobot = false;
    		
    public void run(JuniorRobot robot) {
        if (first) {
        	robot.setColors(JuniorRobot.black, JuniorRobot.white, JuniorRobot.white, JuniorRobot.black, JuniorRobot.black);
            robot.ahead(5000);
            first = false;
        }
        for (int i=0; i < 60; i++) {
            robot.turnGunLeft(gunIncrement);
        }
        gunIncrement *= -1;
    }
    
    public void onScannedRobot(JuniorRobot robot) {
    	   if(readyRobot) {
               if (robot.scannedDistance > 500 ) {
                   robot.fire(1);
               } else if (robot.scannedDistance > 200) {
                   robot.fire(2);
               } else {
                   robot.fire(3);
               }
               robot.turnGunRight(gunIncrement*-2);
               robot.turnGunLeft(gunIncrement*-2);
           }
    }

    public void onHitByBullet(JuniorRobot robot) {
        
    }
    
    public void onHitWall(JuniorRobot robot) {
        if(first) {
            robot.turnRight(robot.hitWallBearing+80);
            robot.ahead(5000);
            readyRobot = true;
        }
        robot.turnRight(180);
    }

    public void onHitRobot(JuniorRobot robot) {
        if(first) {
            robot.turnRight(180);
            robot.ahead(5000);
        }
    }
}
