package AbstractFactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

	public static Computer getComputer(ServerFactory factory) {
		return factory.createComputer();
	}

	public static Computer getComputer(PCFactory factory) {
		return factory.createComputer();
	}
}