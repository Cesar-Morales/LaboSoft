package grupo9JaraYCesar;

import robocode.JuniorRobot;

public class Estrategas {
	
	
	
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
}
