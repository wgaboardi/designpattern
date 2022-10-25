package art.it4sm.abstractFactory;

import art.it4sm.model.Computer;
import art.it4sm.model.PC;

/**
 * Implementing Abstract Factory (PC)
 * Author: IT4Smart
 */
public class PCFactory implements ComputerAbstractFactory {

  private String hdd;
  private String ram;
  private String cpu;
  private boolean graphics;
  private boolean bluetooth;

  public PCFactory(String hdd, String ram, String cpu, boolean graphics, boolean bluetooth) {
    this.hdd = hdd;
    this.ram = ram;
    this.cpu = cpu;
    this.graphics = graphics;
    this.bluetooth = bluetooth;
  }

  @Override
  public Computer createComputer() {
    return new PC.PCBuilder(ram, cpu, hdd)
        .setBluetoothEnabled(graphics)
        .setGraphicsCardEnabled(bluetooth)
        .build();
  }

}
