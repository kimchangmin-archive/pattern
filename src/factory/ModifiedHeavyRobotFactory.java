package factory;

public class ModifiedHeavyRobotFactory extends RobotFactory {

	@Override
	Robot createRobot(String name) {
		try {
			Class<?> cls = Class.forName(name);
			Object obj = cls.newInstance();
			return (Robot) obj;
		}catch(Exception e) {
			return null;
		}		
	}
}
