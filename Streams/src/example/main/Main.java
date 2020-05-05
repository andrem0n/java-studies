package example.main;

import example.Pessoa;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    List<Pessoa> pessoas = new Pessoa().populaPessoas();

    //uso do filter + map
    Stream<String> stream = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
        .map(Pessoa::getNome);
    //stream.forEach(System.out::println);

    //uso do map com conversor para int
    IntStream streamMap = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
        .mapToInt(Pessoa::getIdade);
    //streamMap.forEach(System.out::println);

    //uso do sorted
    Stream<String> sortedStream = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
        .sorted(Comparator.comparing(Pessoa::getNome))
        .map(Pessoa::getNome);
    //sortedStream.forEach(System.out::println);

    //uso distinct
    Stream<Pessoa> distinctStream = pessoas.stream().distinct();
    //distinctStream.forEach(System.out::println);

    //uso limit
    Stream<Pessoa> limitStream = pessoas.stream().limit(3);
    //limitStream.forEach(System.out::println);

    //usando forEach para imprimir nomes
    //pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

    //uso do average
    Double media = pessoas.stream()
        .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
        .mapToInt(Pessoa::getIdade)
        .average()
        .getAsDouble();
    //System.out.println("Média entre idades: " + media);

    //uso do collect(pode transformar para list, set e map)
    List<String> pessoasComM = pessoas.stream()
        .filter(pessoa -> pessoa.getNome().startsWith("M"))
        .map(Pessoa::getNome)
        .collect(Collectors.toList());
    //pessoasComM.forEach(System.out::println);

    //uso do count
    long quantpessoas = pessoas.stream()
        .filter(pessoa -> pessoa.getNome().startsWith("N"))
        .count();
    //System.out.println(quantpessoas);

    //uso do allmatch
    boolean todosMexicanos = pessoas.stream()
        .allMatch(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Mexico"));
    //System.out.printf("Todos são mexicanos? " + todosMexicanos);
  }
}
