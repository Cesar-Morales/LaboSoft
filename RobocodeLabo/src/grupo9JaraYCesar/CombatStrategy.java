package grupo9JaraYCesar;
import robocode.*;

public interface CombatStrategy {
    void run(JuniorRobot robot);
    void onScannedRobot(JuniorRobot robot);
    void onHitByBullet(JuniorRobot robot);
    void onHitWall(JuniorRobot robot);
    void onHitRobot(JuniorRobot robot);
}