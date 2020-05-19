package classe_abstrata;

public class TesteClasseAbstrata {

  public static void main(String[] args) {
    Produto p = new ProdutoPerecivel();
    p.setDescricao("Caixa de Leite");
    p.imprimirDescricao();

    ProdutoPerecivel pp = (ProdutoPerecivel) p;
    pp.setDataValidade("20/10/2020");

    pp.imprimirDescricao();
  }
}
