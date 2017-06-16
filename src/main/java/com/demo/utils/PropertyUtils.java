package com.demo.utils;

import java.util.Properties;

/**
 * 工具类.
 */
public class PropertyUtils {

  public static final Properties PROP = new Properties();

  static {
    try {
      PROP.load(PropertyUtils.class.getResourceAsStream("/config.properties"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * private construct to make this Class Singleton.
   */
  private PropertyUtils() {}

  /**
   * 获取配置项.
   * @param key The key of this config.
   * @return The value of the config key.
   */
  public static String getProperty(String key) {
    Object value = PROP.get(key);
    return value == null ? "" : String.valueOf(value);
  }

  /**
   *  main 函数.
   * @param args The args array info.
   */
  public void main(String[] args) {
    String url = getProperty("url");
    System.out.println(url);
  }

}
