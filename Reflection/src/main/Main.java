package main;

import java.util.Date;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Person person = new Person(123, "André", "Bolzan", 30);
    Product product = new Product(4356, "Xiaomi Mi 9T", 790.00, 1);

    Map<String, Object> attributes = ReflectionMapper.getAttributesMap(person);

    for (String key : attributes.keySet()) {
      System.out.println(key + ": " + attributes.get(key));
    }

    attributes = ReflectionMapper.getAttributesMap(product);

    for (String key : attributes.keySet()
    ) {
      System.out.println(key + ": " + attributes.get(key));
    }
  }
}
