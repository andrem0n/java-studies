package optional.model;

public class Seguradora {

  private String nome;

  @Override
  public String toString() {
    return "{" +
        "nome='" + nome + '\'' +
        '}';
  }

  public Seguradora() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Seguradora(String nome) {
    this.nome = nome;
  }
}
