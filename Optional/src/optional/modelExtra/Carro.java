package optional.modelExtra;

public class Carro {

  private Seguradora seguradora;
  private String nome;

  @Override
  public String toString() {
    return "Carro{" +
        "seguradora=" + seguradora +
        ", nome='" + nome + '\'' +
        '}';
  }

  public Seguradora getSeguradora() {
    return seguradora;
  }

  public void setSeguradora(Seguradora seguradora) {
    this.seguradora = seguradora;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
