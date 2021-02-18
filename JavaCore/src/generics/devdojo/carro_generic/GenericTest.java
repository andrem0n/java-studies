package generics.devdojo.carro_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

  public static void main(String[] args) {
    List<Carro> carrosDisponiveis = new ArrayList<>();
    carrosDisponiveis.add(new Carro("Gol"));
    carrosDisponiveis.add(new Carro("Opala"));
    ObjetoAlugavel<Carro> carroAlugavel = new ObjetoAlugavel<>(carrosDisponiveis);
    Carro carro = carroAlugavel.getObjetoDisponivel();
    System.out.println(carroAlugavel);
  }


  static class ObjetoAlugavel<T> {

    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjetoAlugavel(List<T> objetosDisponiveis) {
      this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getObjetoDisponivel() {
      T t = objetosDisponiveis.remove(0);
      System.out.println("Alugando carro: " + t);
      return t;
    }

    public void devolverObjeto(T t) {
      System.out.println("Devolvendo carro: " + t);
      objetosDisponiveis.add(t);
      System.out.println("carros disponiveis: " + objetosDisponiveis);
    }

    @Override
    public String toString() {
      return "ObjetoAlugavel{" +
          "objetosDisponiveis=" + objetosDisponiveis +
          '}';
    }
  }
}


