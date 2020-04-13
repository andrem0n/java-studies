import java.util.Optional;

public class Main {

  private String nome;
  private Integer numero;

  public static void main(String[] args) {
    Main main = new Main();
    Optional<String> optionalS = Optional.of("AndreDev");
    Optional<String> optionalS1 = Optional.empty();
    Optional<String> optionalS2 = Optional.ofNullable(main.nome);
    Optional<Integer> optionalInteger = Optional.ofNullable(main.numero);

    //imprimindo optionals
    System.out.println(optionalS);
    System.out.println(optionalS1);
    System.out.println(optionalS2);

    //imprimindo valores
    if (optionalS.isPresent())
    System.out.println(optionalS.get());
    System.out.println(optionalS1.orElse("vazio"));
    try {
      System.out.println(optionalS2.orElseThrow(Exception::new));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println(optionalInteger.orElse(-1));
  }

}
