package optional.main;

import java.util.Objects;
import java.util.Optional;
import optional.model.Seguradora;

public class TesteOptional {

  public static void main(String[] args) {
    Seguradora seguradora = new Seguradora("Planalto");
    System.out.println(obterNomeSeguradora(seguradora));
    System.out.println(obterNomeSeguradoraOptional(seguradora));
    checarNomeSeguradora(seguradora);
    checarNomeSeguradoraOptional(seguradora);
  }

  public static String obterNomeSeguradoraOptional(Seguradora seguradora) {
    return Optional.ofNullable(seguradora).map(Seguradora::getNome).orElse("lala");
  }

  public static String obterNomeSeguradora(Seguradora seguradora) {
    if (!seguradora.getNome().isEmpty()) {
      return seguradora.getNome();
    }
    return null;
  }

  public static void checarNomeSeguradora(Seguradora seguradora) {
    if (Objects.nonNull(seguradora) && seguradora.getNome().equals("Planalto")) {
      System.out.println("É uma seguradora Planalto");
    }
  }

  public static void checarNomeSeguradoraOptional(Seguradora seguradora){
    Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("Planalto"))
        .ifPresent(s -> System.out.println("É uma seguradora Planalto"));
  }
}
