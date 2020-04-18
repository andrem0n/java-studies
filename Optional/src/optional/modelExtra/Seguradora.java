package optional.modelExtra;

public class Seguradora {

  private String nome;

  @Override
  public String toString() {
    return "Seguradora{" +
        "nome='" + nome + '\'' +
        '}';
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
