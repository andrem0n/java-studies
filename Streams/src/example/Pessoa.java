package example;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

  private String id;
  private String nome;
  private String nacionalidade;
  private int idade;

  public Pessoa(String id, String nome, String nacionalidade, int idade) {
    this.id = id;
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
  }

  public Pessoa() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "id='" + id + '\'' +
        ", nome='" + nome + '\'' +
        ", nacionalidade='" + nacionalidade + '\'' +
        ", idade=" + idade +
        '}';
  }

  public List<Pessoa> populaPessoas() {
    Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Brasil", 18);
    Pessoa pessoa2 = new Pessoa("p2", "Hernandez Roja", "Mexico", 21);
    Pessoa pessoa3 = new Pessoa("p3", "Mario Fernandes", "Canada", 22);
    Pessoa pessoa4 = new Pessoa("p4", "Clodoaldo José", "Brasil", 22);
    List<Pessoa> list = new ArrayList<Pessoa>();
    list.add(pessoa1);
    list.add(pessoa2);
    list.add(pessoa3);
    list.add(pessoa4);
    return list;
  }
}
