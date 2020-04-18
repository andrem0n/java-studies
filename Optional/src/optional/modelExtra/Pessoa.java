package optional.modelExtra;

public class Pessoa {

  private Carro carro;

  @Override
  public String toString() {
    return "Pessoa{" +
        "carro=" + carro +
        '}';
  }

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }
}
