package basic;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Classe que mostra diferentes formas de se criar uma stream
 */
public class Creator {

  public void basicCreation() {
    //a partir de arrayList
    List<String> items = Arrays.asList("um", "dois", "três");
    Stream<String> stream = items.stream();

    //através de map
    Map<String, String> map = new HashMap<>();
    map.put("key1", "Laranja");
    map.put("key2", "Uva");
    map.put("key3", "Limão");

    Stream<String> mapStream = map.values().stream();

    //direto na lista
    Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4);
    IntStream numbersFromArray = Arrays.stream(new int[]{1, 2, 3, 4});

    //através de um arquivo
    try {
      Stream<String> lines = Files.lines(Paths.get("arquivo.txt"), Charset.defaultCharset());
      Long numberLines = lines.count();
    } catch (IOException e) {
      System.out.println("Arquivo inválido!");
    }


  }

}
