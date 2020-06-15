package generics.devdojo.carro_generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {

  }
}

class CarroAlugavel {

  private List<Carro> carrosDisponiveis = new ArrayList<>();

  {
    carrosDisponiveis.add(new Carro("Mercedes"));
    carrosDisponiveis.add(new Carro("BMW"));
  }
  public Carro getCarroDisponivel(){
    Carro c = carrosDisponiveis.remove(0);
    System.out.println("Alugando carro: " + c);
    return c;
  }

  public void devolverCarro(Carro c){
    System.out.println("Devolvendo carro: " + c);
    carrosDisponiveis.add(c);
    System.out.println("carros disponiveis: " + carrosDisponiveis);
  }
}
