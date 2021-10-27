package grupo9JaraYCesar;
import robocode.*;

public class SpinStrategy implements CombatStrategy {

    public static final CombatStrategy ESTRATEGIA = new SpinStrategy();

    public void run(JuniorRobot robot) {
        robot.setColors(JuniorRobot.orange, JuniorRobot.blue, JuniorRobot.white, JuniorRobot.yellow, JuniorRobot.black);
        robot.turnAheadRight(200,360);
    }

    public void onScannedRobot(JuniorRobot robot) {
        robot.fire(1);
    }

    public void onHitByBullet(JuniorRobot robot) {
    }
    
    public void onHitWall(JuniorRobot robot) {
        robot.turnRight(robot.hitWallBearing + 125);
        robot.ahead(200);
    }

    public void onHitRobot(JuniorRobot robot) {
        robot.turnRight(robot.hitRobotBearing + 125);
        robot.ahead(200);
    }
}