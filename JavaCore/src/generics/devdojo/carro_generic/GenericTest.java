package generics.devdojo.carro_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {


  class ObjetoAlugavel<T> {

    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjetoAlugavel(List<T> objetosDisponiveis) {
      this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getCarroDisponivel(){
       T t = objetosDisponiveis.remove(0);
      System.out.println("Alugando carro: " + t);
      return t;
    }

    public void devolverCarro(T t){
      System.out.println("Devolvendo carro: " + t);
      objetosDisponiveis.add(t);
      System.out.println("carros disponiveis: " + objetosDisponiveis);
    }
  }
}


