package art.it4sm.abstractFactory;

import art.it4sm.model.Computer;

public class ComputerFactory {

  public static Computer getComputer(ComputerAbstractFactory factory) {
    return factory.createComputer();
  }
}
