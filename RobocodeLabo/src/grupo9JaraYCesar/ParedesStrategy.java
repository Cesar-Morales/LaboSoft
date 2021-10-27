package grupo9JaraYCesar;
import robocode.*;

public class ParedesStrategy implements CombatStrategy {

	public static final CombatStrategy ESTRATEGIA = new ParedesStrategy();
	
    private Integer pink = 0xFF00FF;
    private Integer violet = 0x8f33b3;

    public void run(JuniorRobot robot) {
        robot.setColors(pink, violet, violet, pink, pink);
        robot.ahead(5000);
        robot.bearGunTo(90);
    }

    public void onScannedRobot(JuniorRobot robot) {
        if(robot.scannedDistance > 100) {
            moveGun(robot, 2, robot.scannedDistance);
        } else {
            moveGun(robot, 5, robot.scannedDistance);
        }
    }
    
    private void moveGun(JuniorRobot robot, Integer grados, Integer distancia) {
        robot.turnGunRight(grados);
        robot.turnGunRight(4);
        if (distancia > 500 ) {
            robot.fire(1);
        } else if (distancia > 200) {
            robot.fire(2);
        } else {
            robot.fire(3);
        }
        robot.turnGunRight(grados);
    }
    
    

    public void onHitByBullet(JuniorRobot robot) {
    }

    public void onHitRobot(JuniorRobot robot) {
        robot.turnRight(robot.hitRobotBearing + 90);
    }

    public void onHitWall(JuniorRobot robot) {
        robot.turnRight(robot.hitWallBearing + 90);
    }

}