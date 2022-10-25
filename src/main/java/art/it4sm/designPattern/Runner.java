package art.it4sm.designPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import art.it4sm.abstractFactory.PCFactory;
import art.it4sm.abstractFactory.ServerFactory;
import art.it4sm.model.Computer;

@Component
public class Runner implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    testAbstractFactory();
  }

  private static void testAbstractFactory() {
    Computer pc = art.it4sm.abstractFactory.ComputerFactory
        .getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz", true, true));
    Computer server = art.it4sm.abstractFactory.ComputerFactory
        .getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
    System.out.println("AbstractFactory PC Config::" + pc);
    System.out.println("AbstractFactory Server Config::" + server);
  }

}
