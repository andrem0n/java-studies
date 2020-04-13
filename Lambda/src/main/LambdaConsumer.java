package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaConsumer {

  public static void main(String[] args) {
    forEach(Arrays.asList("André", "Bolzan", "Egert"), (nomes) -> System.out.println(nomes));
    List<Integer> nomesLength = map(Arrays.asList("André", "Bolzan", "Egert"), (nomes) -> nomes.length());
    System.out.println(nomesLength);
  }

  public static <T> void forEach(List<T> list, Consumer<T> consumer) {
    for (T e : list
    ) {
      consumer.accept(e);
    }
  }

  public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
    List<R> result = new ArrayList<>();

    for (T e : list
    ) {
      result.add(function.apply(e));
    }
    return result;
  }
}
