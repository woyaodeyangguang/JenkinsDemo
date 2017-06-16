package com.demo.helloworld;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Administrator on 2017/6/4.
 */
public class HelloWorldTest {

  @Test
  public void testSayHello() {
    HelloWorld helloWorld = new HelloWorld();
    String result = helloWorld.sayHello();
    Assert.assertEquals("Hello Maven", result);
  }
}
