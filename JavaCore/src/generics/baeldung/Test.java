package generics.baeldung;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) {
    List<Integer> list = new LinkedList();

    list.add(new Integer(1));
    Integer i = list.iterator().next();

    System.out.println(i);

    Integer[] array = {1,2,3};

    List<Integer> listOfInteger = fromArrayToList(array);
    System.out.println(listOfInteger);

    List<String> listOfIntGeneric = fromArrayToListGeneric(array, Objects::toString);

    System.out.println(listOfIntGeneric);
  }

  public static <T> List<T> fromArrayToList(T[] array) {
    return Arrays.stream(array).collect(Collectors.toList());
  }

  public static <T, G> List<G> fromArrayToListGeneric(T[] array, Function<T, G> mapperFunction){
    return Arrays.stream(array).map(mapperFunction).collect(Collectors.toList());
  }
}
