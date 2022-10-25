package art.it4sm.abstractFactory;

import art.it4sm.model.Computer;
import art.it4sm.model.Server;

/**
 * Implementing Abstract Factory (Server)
 * Author: IT4Smart
 */
public class ServerFactory implements ComputerAbstractFactory {

  private String hdd;
  private String ram;
  private String cpu;

  public ServerFactory(String hdd, String ram, String cpu) {
    this.hdd = hdd;
    this.ram = ram;
    this.cpu = cpu;
  }

  @Override
  public Computer createComputer() {
    return new Server(ram, cpu, hdd);
  }

}
