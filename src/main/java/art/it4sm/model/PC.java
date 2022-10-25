package art.it4sm.model;

public class PC extends Computer {

  private String ram;
  private String hdd;
  private String cpu;

  // optional parameters
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;

  public PC(PCBuilder builder) {
    this.ram = builder.RAM;
    this.hdd = builder.HDD;
    this.cpu = builder.CPU;
    this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    this.isBluetoothEnabled = builder.isBluetoothEnabled;
  }

  public boolean isGraphicsCardEnabled() {
    return isGraphicsCardEnabled;
  }

  public boolean isBluetoothEnabled() {
    return isBluetoothEnabled;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getHDD() {
    return this.hdd;
  }

  @Override
  public String getCPU() {
    return this.cpu;
  }

  public String toString() {
    return "RAM= " + this.ram + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU()
        + ", GraphicsEnabled=" + this.isGraphicsCardEnabled
        + ", BluetoothEnabled=" + this.isGraphicsCardEnabled;
  }

  // Builder Class
  public static class PCBuilder {

    // required parameters
    private String HDD;
    private String RAM;
    private String CPU;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public PCBuilder(String hdd, String ram, String cpu) {
      this.HDD = hdd;
      this.RAM = ram;
      this.CPU = cpu;
    }

    public PCBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
      this.isGraphicsCardEnabled = isGraphicsCardEnabled;
      return this;
    }

    public PCBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }

    public PC build() {
      return new PC(this);
    }

  }

}