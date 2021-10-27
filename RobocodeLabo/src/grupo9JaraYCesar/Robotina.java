package grupo9JaraYCesar;
import robocode.*;

public class Robotina extends JuniorRobot
{
    private static final Estratega estratega = new MarcosEstratega();
    private CombatStrategy estrategiaActual;
    
    private static class PepeEstratega implements Estratega{
        public CombatStrategy calcularEstrategia(JuniorRobot robot) {
            if (robot.energy > 50) {
                return CornerStrategy.ESTRATEGIA;
            }
            return ParedesStrategy.ESTRATEGIA;
        }
    }
    
    private static class MarcosEstratega implements Estratega{
        public CombatStrategy calcularEstrategia(JuniorRobot robot) {
            int others = robot.others;
        	if (others > 5) {
                return SpinStrategy.ESTRATEGIA;
            } else if(others > 3) {
            	return ParedesStrategy.ESTRATEGIA;
            } else
            	return CornerStrategy.ESTRATEGIA;
        }
    }

	public void run() {
		estrategiaActual = estratega.calcularEstrategia(this);
		estrategiaActual.run(this);
	}

	public void onScannedRobot() {
		estrategiaActual.onScannedRobot(this);
	}

	public void onHitByBullet() {
		estrategiaActual.onHitByBullet(this);
	}

	public void onHitRobot(){	
		estrategiaActual.onHitRobot(this);
	}

	public void onHitWall(){
		estrategiaActual.onHitWall(this);
	}	
	public static void main(String[] args) {
		
	}
}
