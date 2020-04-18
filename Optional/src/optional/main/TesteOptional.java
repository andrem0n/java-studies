package optional.main;

import java.util.Optional;
import optional.model.Seguradora;

public class TesteOptional {

  public static void main(String[] args) {
    Seguradora seguradora = new Seguradora("peeei");
    System.out.println(obterNomeSeguradora(seguradora));
    System.out.println(obterNomeSeguradoraOptional(seguradora));
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
}
