package generics;

import java.util.Arrays;
import java.util.List;

public class TesteGenerics {

  public static void main(String[] args) {
    Gaveta<String> gaveta = new Gaveta<>();
    gaveta.colocar("Livro");
    System.out.println(gaveta.retirarPrimeiro());

    List<Funcionario> funcionarios = Arrays.asList(new Funcionario("José"), new Funcionario("Paulo"));

    Funcionario primeiro = Funcionario.recuperaPrimeiro(funcionarios);
    System.out.println(primeiro);
  }
}
