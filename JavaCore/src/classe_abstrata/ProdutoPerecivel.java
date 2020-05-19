package classe_abstrata;

public class ProdutoPerecivel extends Produto {

  private String dataValidade;

  @Override
  public void imprimirDescricao() {
    System.out.println("Descrição do produto: " + getDescricao() + ", data validade: " + dataValidade);
  }

  public String getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }
}
