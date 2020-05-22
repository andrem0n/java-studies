package generics;

import java.util.List;

public class Funcionario {

  private String nome;

  public Funcionario(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public static <T> T recuperaPrimeiro(List<T> t){
    return t.get(0);
  }

  @Override
  public String toString() {
    return "Funcionario{" +
        "nome='" + nome + '\'' +
        '}';
  }
}
