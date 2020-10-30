package ru.vlapin.experiments.vagedemo;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VageDemoApplication {

  @SneakyThrows
  public static void main(String[] args) {
    SpringApplication.run(VageDemoApplication.class, args);

//    ABC abc = new ABC(5);
//    Consumer<ABC> abcConsumer = ABC::kjhdf;
//    abcConsumer.accept(abc);
//
//    ABC.class.getDeclaredMethod("kjhdf").invoke(abc);
//
//
  }
}

//@RequiredArgsConstructor
//class ABC {
//
//  int x;
//
//  @SneakyThrows
//  public void kjhdf(ABC this) {
//    System.out.println("true = " + true);;
//    System.out.println("x = " + this.x);
//  }
//
//
//}
