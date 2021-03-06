package com.dianwoda.usercenter.vera.piper;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author seam
 */
@EnableAutoConfiguration
@SpringBootApplication
public class HZUnit2Application {

  public static void main(String[] args) {
    new SpringApplicationBuilder(HZUnit2Application.class).profiles("hz-unit2").build(args).run(args);
    System.out.println("piper start success");
  }
}
