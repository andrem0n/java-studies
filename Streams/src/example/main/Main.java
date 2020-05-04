package example.main;

import example.Pessoa;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    List<Pessoa> pessoas = new Pessoa().populaPessoas();

    Stream<String> stream = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
        .map(Pessoa::getNome);
    stream.forEach(System.out::println);
  }
}
