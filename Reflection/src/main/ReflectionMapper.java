package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionMapper {

  public static Map<String, Object> getAttributesMap(Object obj) {
    Map<String, Object> attributesMap = new HashMap<>();

    Class<?> objClass = obj.getClass();
    Method[] methods = objClass.getMethods();

    for (Method method : methods) {
      if (method.getName().startsWith("get") && method.getReturnType() != void.class) {
        String attributeName = getAttributeName(method.getName());
        try {
          Object value = method.invoke(obj);
          attributesMap.put(attributeName, value);
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        } catch (InvocationTargetException e) {
          e.printStackTrace();
        }
      }
    }
    return attributesMap;
  }

  private static String getAttributeName(String name) {
    return name.substring(3);
  }

}
