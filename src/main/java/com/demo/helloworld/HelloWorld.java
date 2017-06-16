package com.demo.helloworld;

/**
 * HelloWorld.
 */
public class HelloWorld {

  /**
   * say Hello方法.
   * @return The value of it says.
   */
  public String sayHello() {
    String str1 = "bob" + "ddd"
        + "sdafdsa";
    // use plugin to find bugs
    str1.replace("b", "p");
    if (str1.equals("pop")) {
      System.out.println("replace success!");
    }
    return "Hello Maven";
  }

  /**
   * This is a bye bye method.
   */
  public static void sayByeBye() {
    for (int i = 10; i < 100; i++) {
      System.out.println("Bye Bye");
    }
  }
}
